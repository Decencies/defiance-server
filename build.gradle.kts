plugins {
    kotlin("jvm") version "1.8.0"
}

group = "dev.mappings"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.netty:netty-all:4.1.86.Final")
}

kotlin {
    jvmToolchain(17)
}