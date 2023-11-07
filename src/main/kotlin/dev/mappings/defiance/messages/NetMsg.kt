package dev.mappings.defiance.messages

import dev.mappings.defiance.messages.codec.BitBuf

abstract class NetMsg {
    abstract fun read(buf: BitBuf)
    abstract fun write(buf: BitBuf)
}