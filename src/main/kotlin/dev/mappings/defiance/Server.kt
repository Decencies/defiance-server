package dev.mappings.defiance

import dev.mappings.defiance.debug.debug
import dev.mappings.defiance.messages.codec.MessageDecoder
import dev.mappings.defiance.messages.codec.MessageEncoder

import io.netty.channel.*
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.netty.bootstrap.ServerBootstrap
import java.net.InetSocketAddress

const val DefaultPort = 50000

val ChildHandler = object : ChannelInitializer<SocketChannel>() {
    override fun initChannel(ch: SocketChannel) {
        ch.pipeline().apply {
            addLast("encoder", MessageEncoder())
            addLast("decoder", MessageDecoder())
            addLast("handler", ServerHandler())
        }
    }
}

fun main() {
    val bossGroup = NioEventLoopGroup(1)
    val workerGroup = NioEventLoopGroup()

    try {
        val bootstrap = ServerBootstrap()
        bootstrap.group(bossGroup, workerGroup)
            .channel(NioServerSocketChannel::class.java)
            .childHandler(ChildHandler)
            .option(ChannelOption.SO_BACKLOG, 128)
            .option(ChannelOption.SO_REUSEADDR, true)
            .childOption(ChannelOption.SO_KEEPALIVE, true)
            .childOption(ChannelOption.TCP_NODELAY, true)

        val channelFuture = bootstrap.bind(DefaultPort).sync()
        debug("server started on port ${(channelFuture.channel().localAddress() as InetSocketAddress).port}")
        channelFuture.channel().closeFuture().sync()
    } finally {
        bossGroup.shutdownGracefully()
        workerGroup.shutdownGracefully()
    }
}

