package dev.mappings.defiance.messages.codec

import dev.mappings.defiance.util.warn
import io.netty.buffer.ByteBuf
import io.netty.channel.Channel
import java.net.InetSocketAddress

val Channel.addr: String get() {
    val addr = remoteAddress() as InetSocketAddress
    return if (addr.hostName.equals("127.0.0.1")) "localhost:${addr.port}" else addr.toString()
}

fun ByteBuf.discard() {
    if (readableBytes() == 0) return

    warn("discarding ${readableBytes()} unread bytes from message")
    readerIndex(readerIndex() + readableBytes())
}

fun ByteBuf.discardWithWarning(warning: String) {
    warn(warning); discard()
}

fun ByteBuf.hexdump(columns: Int = 8) {
    assert(isReadable) {
        "ByteBuf must be readable!"
    }

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