package dev.mappings.defiance.messages.codec

import dev.mappings.defiance.util.debug
import dev.mappings.defiance.util.warn
import dev.mappings.defiance.messages.NetMsg
import dev.mappings.defiance.messages.NetMsgs

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder

class MessageDecoder : ByteToMessageDecoder() {
    private fun BitBuf.decodeHeader(): UInt? {
        if (buf.readableBytes() < 3) return null

        val bitCount = when (readBits(2)) {
            1u -> 15
            2u -> 23
            4u -> 31
            else -> 11
        }

        assert(buf.readableBytes() > (bitCount * 2) / 8) {
            "There aren't enough bytes to read type and size fields from the header! (required: ${(bitCount * 2) / 8} received: ${buf.readableBytes()})"
        }

        val type = readBits(bitCount)
        val size = readBits(bitCount)

        assert(buf.readableBytes() >= size.toInt()) {
            "There aren't enough bytes to read the message! (required: $size received: ${buf.readableBytes()})"
        }

        verifyBitOffset()

        return type
    }

    override fun decode(ctx: ChannelHandlerContext, buf: ByteBuf, out: MutableList<Any>) {
        val bb = BitBuf(buf)

        debug("received ${buf.readableBytes()} bytes from ${ctx.channel().addr}")

        val type = bb.decodeHeader() ?: return buf.discardWithWarning("received less than 3 bytes from ${ctx.channel().addr}")

        val cls = NetMsgs[type.toInt()] ?: return buf.discardWithWarning("received unhandled message $type")
        val msg = cls.java.constructors[0].newInstance() as NetMsg

        assert(msg.type == type.toInt()) {
            "Message type is ${type.toInt()} but definition is ${msg.type}"
        }

        msg.read(bb)
        out.add(msg)

        buf.discard()
    }
}