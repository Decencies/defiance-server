package dev.mappings.defiance.messages.twn

import dev.mappings.defiance.debug.debug
import dev.mappings.defiance.messages.codec.MsgTypes
import dev.mappings.defiance.messages.NetMsg
import dev.mappings.defiance.messages.codec.BitBuf
import dev.mappings.defiance.messages.codec.addr
import dev.mappings.defiance.messages.codec.hexdump
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import io.netty.channel.ChannelHandlerContext

class TwnEngineCryptChallengeMsg : NetMsg() {
    override val type: Int get() = MsgTypes.TwnEngineCryptChallenge

    var challengeSize: UInt = 0u; private set

    var challenge: ByteBuf = Unpooled.buffer(); private set

    override fun read(buf: BitBuf) {
        challengeSize = buf.buf.readUnsignedIntLE().toUInt()
        buf.buf.readBytes(challenge)

        assert(challenge.readableBytes() == challengeSize.toInt()) {
            "Challenge size does not match"
        }
    }

    override fun write(buf: BitBuf) = TODO()
}

// TwnNetConnection::ProcessCryptChallenge (impl on pc is at .text:00827F30)
fun ProcessCryptChallenge(msg: TwnEngineCryptChallengeMsg, ctx: ChannelHandlerContext) {
    debug("received crypt challenge from ${ctx.channel().addr}!")
    debug("challenge size: ${msg.challengeSize}")

    //msg.challenge.hexdump()

    debug("Sending dummy challenge response")

    ctx.writeAndFlush(TwnEngineCryptResponseMsg())
}