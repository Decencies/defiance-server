package dev.mappings.defiance.messages.codec

import io.netty.buffer.ByteBuf

fun logBuf(buf: ByteBuf) {
    val c = ByteArray(buf.readableBytes()) { i -> buf.getByte(i) }

    val output = c.mapIndexed { index, b ->
        b.toUByte().toString(16).padStart(2, '0') + (if (index != 0 && index % 8 == 0) "\n" else "")
    }

    println(output.joinToString(" "))
}