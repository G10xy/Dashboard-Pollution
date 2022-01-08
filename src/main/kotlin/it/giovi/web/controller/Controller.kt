package it.giovi.web.controller

import com.example.model.DashboardResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.http.MediaType
import org.springframework.web.servlet.ModelAndView

interface Controller {

    fun startDashboard() : ModelAndView

    @Operation(summary = "Get all pollution data")
    @ApiResponses(value = [
        ApiResponse(responseCode = "200", description = "Found pollution data", content = [
            (Content(mediaType = MediaType.APPLICATION_JSON_VALUE, array = (
                    ArraySchema(schema = Schema(implementation = DashboardResponse::class)))))]),
        ApiResponse(responseCode = "400", description = "Bad request", content = [Content()]),
        ApiResponse(responseCode = "404", description = "Did not find any cities' data", content = [Content()]),
        ApiResponse(responseCode = "500", description = "Internal Server", content = [Content()])]
    )fun pollutionData() : Collection<DashboardResponse>
}