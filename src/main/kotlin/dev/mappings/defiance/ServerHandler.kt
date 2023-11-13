package dev.mappings.defiance

import dev.mappings.defiance.util.debug
import dev.mappings.defiance.util.warn
import dev.mappings.defiance.messages.codec.addr
import dev.mappings.defiance.messages.twn.ProcessCryptChallenge
import dev.mappings.defiance.messages.twn.TwnEngineCryptChallengeMsg
import io.netty.channel.ChannelDuplexHandler
import io.netty.channel.ChannelHandlerContext

class ServerHandler : ChannelDuplexHandler() {

    override fun channelActive(ctx: ChannelHandlerContext) {
        super.channelActive(ctx); debug("client ${ctx.channel().addr} connected")
    }

    override fun channelInactive(ctx: ChannelHandlerContext) {
        super.channelInactive(ctx); debug("client ${ctx.channel().addr} disconnected")
    }

    override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
        super.channelRead(ctx, msg); debug("received ${msg::class.simpleName} from client ${ctx.channel().addr}")
        when (msg) {
            is TwnEngineCryptChallengeMsg -> ProcessCryptChallenge(msg, ctx)
            else -> warn("No handler registered for message type ${msg::class.simpleName}")
        }
    }

    @Suppress("Override_Deprecation")
    override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) {
        if (cause.message == "Connection reset") return

        warn("client exception from client ${ctx.channel().addr}:"); cause.printStackTrace()
    }
}