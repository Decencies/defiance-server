package dev.mappings.defiance.messages.codec

import dev.mappings.defiance.util.debug
import dev.mappings.defiance.util.warn
import dev.mappings.defiance.messages.NetMsg
import dev.mappings.defiance.messages.NetMsgs

import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder

class MessageDecoder : ByteToMessageDecoder() {

    private fun ByteBuf.discard() {
        if (readableBytes() == 0) return

        warn("discarding ${readableBytes()} unread bytes from message")
        readerIndex(readerIndex() + readableBytes())
    }

    private fun ByteBuf.discardWithWarning(warning: String) {
        warn(warning); discard()
    }

    override fun decode(ctx: ChannelHandlerContext, buf: ByteBuf, out: MutableList<Any>) {
        val bb = BitBuf(buf)

        debug("received ${buf.readableBytes()} bytes from ${ctx.channel().addr}")

        if (buf.readableBytes() <= 0) return

        val bitCount = when (bb.readBits(2)) {
            1u -> 15
            2u -> 23
            4u -> 31
            else -> 11
        }

        assert(buf.readableBytes() > (bitCount * 2) / 8) {
            "There aren't enough bytes to read type and size fields from the header! (required: ${(bitCount * 2) / 8} received: ${buf.readableBytes()})"
        }

        val type = bb.readBits(bitCount)
        val size = bb.readBits(bitCount)

        assert(buf.readableBytes() >= size.toInt()) {
            "There aren't enough bytes to read the message! (required: $size received: ${buf.readableBytes()})"
        }

        bb.verifyBitOffset()

        val cls = NetMsgs[type.toInt()] ?: return buf.discardWithWarning("received unhandled message $type (size: $size)")
        val msg = cls.java.constructors[0].newInstance() as NetMsg

        assert(msg.type == type.toInt()) {
            "Message type is ${type.toInt()} but definition is ${msg.type}"
        }

        msg.read(bb)
        out.add(msg)

        buf.discard()
    }
}