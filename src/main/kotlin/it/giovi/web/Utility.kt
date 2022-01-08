package it.giovi.web

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*


class Utility {

    companion object {
        fun convertLongToTime(time: Long): String {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm", Locale.US)
            return Instant.ofEpochSecond(time)
                .atZone(ZoneId.of("UTC"))
                .toLocalDateTime().format(formatter)
        }
    }
}