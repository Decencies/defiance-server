package dev.mappings.defiance.messages.twn

import dev.mappings.defiance.messages.NetMsg
import dev.mappings.defiance.messages.codec.BitBuf

class TwnEngineCryptResponseMsg : NetMsg() {
    override val type: Int get() = TwnNetDefs.TwnEngineCryptResponse

    override fun read(buf: BitBuf) = TODO()

    override fun write(buf: BitBuf) {
        buf.buf.writeInt(0) // responseSize
    }
}