package com.example.service

import com.example.model.DashboardResponse
import it.giovi.web.model.CityData
import it.giovi.web.model.PollutionData
import org.mapstruct.*
import java.time.Instant
import java.time.LocalDateTime
import java.util.*

@Mapper
interface MapConverter {

    fun pollutionDataDtoToResponse(data: PollutionData): DashboardResponse
}