package it.giovi.service

import com.example.model.DashboardResponse
import com.example.service.MapConverter
import it.giovi.web.Utility
import it.giovi.persistence.entity.CityEntity
import it.giovi.persistence.repository.CityRepository
import it.giovi.web.model.ResponseApiWeatherData
import org.bson.types.ObjectId
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service
import java.util.concurrent.CompletableFuture


@Service
class CityService(private var restService: RestService, private var repo: CityRepository) {

    val mapConverter: MapConverter = Mappers.getMapper(MapConverter::class.java)

    fun getData(): Collection<DashboardResponse> {
        val cities= this.repo.findAll()
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

    private fun createFuturesRestCalls(cities: Collection<CityEntity>): MutableList<CompletableFuture<ResponseApiWeatherData>> {
        val futures= mutableListOf<CompletableFuture<ResponseApiWeatherData> >()
        cities.stream().forEach { city ->
            futures.add(restService.getPollutionData(city.name, city.lat, city.lon))
        }
        return futures
    }
}