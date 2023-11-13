package dev.mappings.defiance.ch2

object WeaponCategory {
    const val Invalid = -1
    const val Pistol = 0
    const val Bmg = 1
    const val AssaultRifle = 2
    const val Shotgun = 3
    const val SniperRifle = 4
    const val GrenadeLauncher = 5
    const val RocketLauncher = 6
    const val Needle = 7
    const val Minigun = 8
    const val Melee = 9
    const val SMG = 10
    const val LMG = 11
    const val ShotgunPump = 12
    const val ShotgunSawedOff = 13
    const val SniperSemi = 14
    const val SniperCharge = 15
    const val RocketSpread = 16
    const val RocketLockon = 17
}

object DeathType {
    const val None = 0
    const val Standard = 1
    const val Special = 2
    const val Ragdoll = 4
    const val ExplodeRagdoll = 8
    const val Headshot = 16
    const val Electrocute = 32
    const val Infector = 64
    const val RagdollForce = 128
    const val Freeze = 256
    const val SyphonAnim = 512
    const val SlowAndEvap = 1024
    const val StandardDirectionals = 2048
    const val PlayAnimation = 2675
    const val AppendTypes = 1024
    const val SupportedByAll = 1280
}

object AmmoHitOrientation {
    const val First = 0
    const val Aligned = 0
    const val Ricochet = 1
    const val Surface = 2
    const val Count = 3
    const val Last: UInt = 2u
    const val Invalid: UInt = 0xffffffffu
}

