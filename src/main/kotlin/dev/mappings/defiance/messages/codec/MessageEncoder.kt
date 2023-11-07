package dev.mappings.defiance.messages.codec

import dev.mappings.defiance.messages.NetMsg
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder

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