package it.giovi.web.controller

import com.example.model.DashboardResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import it.giovi.web.model.CityGeoInfo
import org.springframework.http.MediaType
import org.springframework.security.core.Authentication
import org.springframework.web.servlet.ModelAndView

interface Controller {

    fun startDashboard() : ModelAndView

    @Operation(summary = "Get all pollution data")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Found pollution data", content = [
            (Content(mediaType = MediaType.APPLICATION_JSON_VALUE, array = (
                    ArraySchema(schema = Schema(implementation = DashboardResponse::class)))))]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
        ApiResponse(responseCode = "500", description = "Internal Server", content = [Content()])]
    )fun pollutionData(authentication: Authentication) : Collection<DashboardResponse>


    @Operation(summary = "Look for city of interest")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Found a list of cities", content = [
            (Content(mediaType = MediaType.APPLICATION_JSON_VALUE, array = (
                    ArraySchema(schema = Schema(implementation = CityGeoInfo::class)))))]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
        ApiResponse(responseCode = "500", description = "Internal Server", content = [Content()])]
    )fun lookForCity(cityName: String) : Collection<CityGeoInfo>

    @Operation(summary = "Remove city from user's list of interest")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Correctly removed", content = [(Content(mediaType = MediaType.APPLICATION_JSON_VALUE))]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
        ApiResponse(responseCode = "500", description = "Internal Server", content = [Content()])]
    )fun removeCity(cityName: String, authentication: Authentication)
}