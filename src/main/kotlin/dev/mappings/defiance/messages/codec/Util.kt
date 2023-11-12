package dev.mappings.defiance.messages.codec

import io.netty.buffer.ByteBuf
import io.netty.channel.Channel
import java.net.InetSocketAddress

fun ByteBuf.hexdump(columns: Int = 8) {
    val bytes = if (hasArray()) array() else ByteArray(readableBytes()).apply {
        markReaderIndex()
        readBytes(this)
        resetReaderIndex()
    }

    for (j in bytes.indices step columns) {
        if (j != 0) println()
        System.out.printf("0x%02X\t|\t", j)
        for (i in j..<minOf(j + columns, bytes.size)) {
            System.out.printf("%02X ", bytes[i])
        }
    }
    println()
}

val Channel.addr: String get() {
    val addr = remoteAddress() as InetSocketAddress
    return if (addr.hostName.equals("127.0.0.1")) "localhost:${addr.port}" else addr.toString()
}
