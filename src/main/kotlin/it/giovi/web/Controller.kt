package it.giovi.web

import it.giovi.web.model.ResponseApiWeatherData
import it.giovi.web.service.CityService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView
import java.util.concurrent.CompletableFuture

@RestController
class Controller(
    private val cityService: CityService
) {

    @GetMapping("/dashboard")
    fun startDashboard() : ModelAndView {
        return ModelAndView("dashboard")
    }

    @GetMapping("/pollutionData")
    fun pollutionData() =
        cityService.getData()

}