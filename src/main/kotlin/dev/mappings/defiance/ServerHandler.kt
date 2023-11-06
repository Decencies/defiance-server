package dev.mappings.defiance

import io.netty.channel.ChannelDuplexHandler
import io.netty.channel.ChannelHandlerContext

class ServerHandler : ChannelDuplexHandler() {
    override fun channelActive(ctx: ChannelHandlerContext) {
        println("client ${ctx.channel().remoteAddress()} connected")
        super.channelActive(ctx)
    }

    override fun channelInactive(ctx: ChannelHandlerContext) {
        println("client ${ctx.channel().remoteAddress()} disconnected")
        super.channelInactive(ctx)
    }

    override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
        println("received $msg from client ${ctx.channel().remoteAddress()}")
        super.channelRead(ctx, msg)
    }

    @Suppress("Override_Deprecation")
    override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) {
        cause.printStackTrace()
    }
}