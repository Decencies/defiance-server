package dev.mappings.defiance.messages.ch2

import dev.mappings.defiance.messages.codec.MsgTypes
import dev.mappings.defiance.messages.NetMsg
import dev.mappings.defiance.messages.codec.BitBuf

class AuthRequestMsg : NetMsg() {
    override val type: Int get() = MsgTypes.Ch2AuthRequest

    override fun read(buf: BitBuf) {
        /**
        val majorVersion = buf.readUnsignedInt()
        val minorVersion = buf.readUnsignedInt()
        val buildVersion = buf.readUnsignedInt()
        val username = buf.readCharSequence(512, Charset.defaultCharset())
        val platformUID = buf.readLong()
        val tokenType = buf.readInt()
        val token = buf.readCharSequence(buf.readableBytes(), Charset.defaultCharset())

        println("$majorVersion, $minorVersion, $buildVersion, $username, $platformUID, $tokenType, $token")
        */
    }

    override fun write(buf: BitBuf) = TODO()
}