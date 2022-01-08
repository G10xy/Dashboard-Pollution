package it.giovi.web.controller

import com.example.model.DashboardResponse
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import it.giovi.web.service.CityService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
class ControllerImpl  (
    private val cityService: CityService
) : Controller
{

    @GetMapping("/dashboard")
    override fun startDashboard() : ModelAndView {
        return ModelAndView("dashboard")
    }


    @GetMapping("/pollutionData")
    override fun pollutionData() =
        cityService.getData()

}