package dev.mappings.defiance.messages.codec

import dev.mappings.defiance.debug.debug
import dev.mappings.defiance.debug.warn
import dev.mappings.defiance.messages.BitBuf
import dev.mappings.defiance.messages.MessageType
import dev.mappings.defiance.messages.NetMsg
import dev.mappings.defiance.messages.logBuf
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder
import io.netty.handler.codec.MessageToByteEncoder

/**
 * Decodes incoming network messages
 */
class MessageDecoder : ByteToMessageDecoder() {
    /**
     * Decodes the header.
     * @see "TwnNetBuffer::UnpackHeader"
     */
    override fun decode(ctx: ChannelHandlerContext, buf: ByteBuf, out: MutableList<Any>) {
        val bb = BitBuf(buf)

        bb.buf.retain()

        debug("received ${buf.readableBytes()} bytes from ${ctx.channel().remoteAddress()}")

        if (buf.readableBytes() <= 0) return

        val bitCount = when (bb.readBits(2)) {
            1u -> 15
            2u -> 23
            4u -> 31
            else -> 11
        }

        debug("Determined header field sizes to be $bitCount bits")

        assert(buf.readableBytes() > (bitCount * 2) / 8) {
            "There aren't enough bytes to read type and size fields from the header! (required: ${(bitCount * 2) / 8} received: ${buf.readableBytes()})"
        }

        val type = bb.readBits(bitCount)
        val size = bb.readBits(bitCount)

        assert(buf.readableBytes() >= size.toInt()) {
            "There aren't enough bytes to read the message! (required: $size received: ${buf.readableBytes()})"
        }

        println("received message type ${type.toString(16)} (size: $size)")

        bb.verifyBitOffset()

        when (type.toInt()) {
            // TwnNetConnection::ProcessCryptChallenge (impl on pc is at .text:00827F30)
            MessageType.TwnEngineCryptChallenge -> {
                debug("received crypt challenge!")
                val challengeSize = bb.buf.readUnsignedIntLE()

                debug("challenge size: $challengeSize")
                val challenge = bb.buf.readBytes(challengeSize.toInt())

                logBuf(challenge)

                // Diffie-Hellman

            }
        }
        // todo: process message
        //val msgBuf = buf.readBytes(size.toInt())
        out.add(Any())

        warn("discarding ${buf.readableBytes()} unread bytes from message")

        // discard tail
        buf.readerIndex(buf.readerIndex() + buf.readableBytes())
    }
}

class MessageEncoder : MessageToByteEncoder<NetMsg>() {
    /**
     * Encodes the header
     * @see "TwnNetBuffer::PackHeader"
     */
    override fun encode(ctx: ChannelHandlerContext, msg: NetMsg, out: ByteBuf) {
        val bb = BitBuf(out)

        bb.buf.retain()

        out.markWriterIndex()
        msg.write(bb)
        out.resetWriterIndex()

        println("encoded $msg (${out.readableBytes()} bytes) to ${ctx.channel().remoteAddress()}")
    }
}