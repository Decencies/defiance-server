package dev.mappings.defiance.messages.codec

import io.netty.buffer.ByteBuf

class BitBuf(val buf: ByteBuf) {
    var bitOffset = 0

    fun readBits(bitCount: Int): UInt {
        assert(buf.isWritable)
        assert(bitCount <= 32)

        when (bitCount) {
            8 -> return buf.readUnsignedByte().toUInt()
            16 -> return buf.readUnsignedShort().toUInt()
            32 -> return buf.readUnsignedInt().toUInt()
        }

        var value = 0u
        var index = buf.readerIndex()

        for (bitIndex in 0 until bitCount) {
            val byteAt = buf.getUnsignedByte(index).toUInt()

            value =
                if (byteAt and (1u shl bitOffset) != 0u) value or (1u shl bitIndex)
                else value and (1u shl bitIndex).inv()

            if (++bitOffset >= 8) {
                bitOffset = 0
                index++
            }
        }

        buf.readerIndex(index)

        return value
    }

    fun verifyBitOffset() {
        if (bitOffset != 0) error("Bit offset is not 0!")
    }

    fun writeBits(value: UInt, bitCount: Int) {
        assert(buf.isWritable)
        assert(bitCount <= 32)

        when (bitCount) {
            8 -> buf.writeByte(value.toInt())
            16 -> buf.writeShort(value.toInt())
            32 -> buf.writeInt(value.toInt())
        }

        var index = buf.readerIndex()

        for (bitIndex in 0 until bitCount) {
            val byteAt = buf.getUnsignedByte(index).toUInt()

            if (value and (1u shl bitIndex) != 0u)
                buf.setByte(index, (byteAt or (1u shl bitOffset)).toInt())
            else buf.setByte(index, (byteAt and (1u shl bitOffset)).inv().toInt())

            if (++bitOffset >= 8) {
                bitOffset = 0
                index++
            }
        }
    }
}