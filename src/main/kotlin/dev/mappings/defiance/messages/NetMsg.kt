package dev.mappings.defiance.messages

abstract class NetMsg {
    abstract fun read(buf: BitBuf)
    abstract fun write(buf: BitBuf)
}