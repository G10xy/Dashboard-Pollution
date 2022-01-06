package it.giovi.web

import java.text.SimpleDateFormat
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.util.*

class Utility {

    companion object {
        fun convertLongToTime(time: Long): LocalDateTime {
            return Instant.ofEpochSecond(time)
                .atZone(ZoneId.of("UTC"))
                .toLocalDateTime()
        }
    }
}