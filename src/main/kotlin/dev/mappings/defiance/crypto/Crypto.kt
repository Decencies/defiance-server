package dev.mappings.defiance.crypto

import java.math.BigInteger
import java.security.KeyPairGenerator
import javax.crypto.spec.DHParameterSpec


object Crypto {
    private val g512 = BigInteger(javaClass.getResourceAsStream("key.bin")?.readAllBytes()?.joinToString("") { c -> c.toString(16) }
        ?: "0", 16)
    private val p512 = BigInteger("1234567890", 16)

    fun e() {
        val dhParams = DHParameterSpec(p512, g512)
        val gen = KeyPairGenerator.getInstance("DH", "SunJCE")
    }
}