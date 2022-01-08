package com.example.model

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema
import java.time.LocalDateTime

@Schema(description = "Model about city pollution data.")
data class DashboardResponse(
    @JsonProperty("city") var city: String?,
    @field:Schema(
        description = "Air Quality Index, see more: https://en.wikipedia.org/wiki/Air_quality_index",
        type = "int",
        minimum = "1",
        maximum = "5"
    )
    @JsonProperty("aqi") var aqi: Int?,
    @JsonProperty("date") var date: String?,
    @JsonProperty("co") val co: Double,
    @JsonProperty("no") val no: Double,
    @JsonProperty("no2") val no2: Double,
    @JsonProperty("o3") val o3: Double,
    @JsonProperty("so2") val so2: Double,
    @JsonProperty("pm2_5") val pm2_5: Double,
    @JsonProperty("pm10") val pm10: Double,
    @JsonProperty("nh3") val nh3: Double)
