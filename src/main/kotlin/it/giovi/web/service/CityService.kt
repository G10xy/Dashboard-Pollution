package it.giovi.web.service

import com.example.model.DashboardResponse
import com.example.service.MapConverter
import it.giovi.web.Utility
import it.giovi.web.entity.City
import it.giovi.web.model.ResponseApiWeatherData
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service
import java.util.concurrent.CompletableFuture


@Service
class CityService(private var restService: RestService) {

    val mapConverter: MapConverter = Mappers.getMapper(MapConverter::class.java)

    fun getData(): Collection<DashboardResponse> {
        val a = City("Roma",41.8933203, 12.4829321)
        val b = City("Milano",45.4642162, 9.1898182)
        val c = City("Napoli",40.8359336, 14.2487826)
        val d = City("Catania", 37.5023612, 15.0873718)

        val cities= listOf<City>(a, b, c, d)
        val responseResults = mutableListOf<DashboardResponse>()

        this.createFuturesRestCalls(cities).stream()
            .map { obj: CompletableFuture<ResponseApiWeatherData> -> obj.get() }
            .forEach { x ->
                val response = mapConverter.pollutionDataDtoToResponse(x.list[0].components)
                response.aqi= x.list[0].main.aqi
                response.date= Utility.convertLongToTime(x.list[0].dt)
                response.city= x.city
                responseResults.add(response)
             }
        return responseResults
    }

    private fun createFuturesRestCalls(cities: Collection<City>): MutableList<CompletableFuture<ResponseApiWeatherData>> {
        val futures= mutableListOf<CompletableFuture<ResponseApiWeatherData> >()
        cities.stream().forEach { city ->
            futures.add(restService.getPollutionData(city.name, city.lat, city.lon))
        }
        return futures
    }
}