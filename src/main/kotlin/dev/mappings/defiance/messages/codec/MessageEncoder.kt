package dev.mappings.defiance.messages.codec

import dev.mappings.defiance.debug.debug
import dev.mappings.defiance.messages.NetMsg

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder

class MessageEncoder : MessageToByteEncoder<NetMsg>() {
    private fun BitBuf.encodeHeader(type: Int, size: Int) {
        val hdrTypeBits: UInt
        val bitCount: Int

        if (type and -0x800000 != 0 || size and -0x800000 != 0) {
            hdrTypeBits = 4u
            bitCount = 31
        } else if (type and -0x8000 != 0 || size and -0x8000 != 0) {
            hdrTypeBits = 2u
            bitCount = 23
        } else if (type and -0x800 != 0 || size and -0x800 != 0) {
            hdrTypeBits = 1u
            bitCount = 15
        } else {
            hdrTypeBits = 0u
            bitCount = 11
        }

        writeBits(hdrTypeBits, 2)
        writeBits(type.toUInt(), bitCount)
        writeBits(size.toUInt(), bitCount)
    }

    override fun encode(ctx: ChannelHandlerContext, msg: NetMsg, out: ByteBuf) {
        val bb = BitBuf()
        msg.write(bb)

        val outWrapper = BitBuf(out)
        outWrapper.encodeHeader(msg.type, bb.buf.readableBytes())

        outWrapper.buf.writeBytes(bb.buf)

        debug("encoded ${msg::class.simpleName} (${out.readableBytes()} bytes) for ${ctx.channel().addr}")
    }
}