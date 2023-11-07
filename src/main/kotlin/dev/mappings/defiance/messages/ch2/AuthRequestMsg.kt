package dev.mappings.defiance.messages.ch2

import dev.mappings.defiance.messages.NetMsg
import dev.mappings.defiance.messages.codec.BitBuf

/**
 * @see MessageType.Ch2AuthRequest
 */
class AuthRequestMsg : NetMsg() {
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

    override fun write(buf: BitBuf) = throw Error()
}