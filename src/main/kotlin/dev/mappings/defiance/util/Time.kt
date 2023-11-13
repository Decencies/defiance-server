package dev.mappings.defiance.util

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

private val DateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

val dateAndTime: String get() = LocalDateTime.now().format(DateFormatter)