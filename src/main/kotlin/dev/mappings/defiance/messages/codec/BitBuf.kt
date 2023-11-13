package dev.mappings.defiance.messages.codec

import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled

class BitBuf(val buf: ByteBuf) {
    private var bitOffset = 0

    constructor() : this(Unpooled.buffer())

    fun readBits(bitCount: Int): UInt {
        assert(bitCount <= 32)

        when (bitCount) {
            8 -> return buf.readUnsignedByte().toUInt()
            16 -> return buf.readUnsignedShort().toUInt()
            32 -> return buf.readUnsignedInt().toUInt()
        }

        var value = 0u
        var index = buf.readerIndex()

        for (bitIndex in 0..<bitCount) {
            val byteAt = buf.getUnsignedByte(index).toUInt()

            value = value or ((byteAt and (1u shl bitOffset)) shr bitOffset).shl(bitIndex)

            if (++bitOffset >= 8) {
                index++
                bitOffset = 0
            }
        }

        buf.readerIndex(index)

        return value
    }

    fun verifyBitOffset() = assert(bitOffset == 0) {
        "Bit offset is not 0!"
    }

    fun writeBits(value: UInt, bitCount: Int) {
        assert(buf.isWritable)
        assert(bitCount <= 32)

        var index = -1

        when (bitCount) {
            8 -> buf.writeByte(value.toInt())
            16 -> buf.writeShort(value.toInt())
            32 -> buf.writeInt(value.toInt())
            else -> index = buf.writerIndex()
        }

        if (index < 0) return

        for (bitIndex in 0..<bitCount) {
            val byteAt = buf.getUnsignedByte(index).toUInt()

            if (value and (1u shl bitIndex) != 0u)
                buf.setByte(index, (byteAt or (1u shl bitOffset)).toInt())
            else buf.setByte(index, (byteAt and (1u shl bitOffset).inv()).toInt())

            if (++bitOffset >= 8) {
                index++
                bitOffset = 0
            }
        }

        buf.writerIndex(index)
    }
}