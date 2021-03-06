package it.giovi.service

import it.giovi.web.model.CityGeoInfo
import it.giovi.web.model.ResponseApiWeatherData
import org.springframework.beans.factory.annotation.Value
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.util.concurrent.CompletableFuture


@Service
class RestService(private val restTemplate: RestTemplate, @Value("\${appId}") private val appId: String) {

    @Async("threadPoolForData")
    @Throws(InterruptedException::class)
    fun getPollutionData(name:String, lat: Double, lon: Double): CompletableFuture<ResponseApiWeatherData> {
        val url = "/data/2.5/air_pollution?lat=$lat&lon=$lon&appid=$appId"
        val response = restTemplate.getForObject(url, ResponseApiWeatherData::class.java)
        if (response != null) {
            response.city=name
        }
        return CompletableFuture.completedFuture(response)
    }


    fun lookForCity(name: String): Collection<CityGeoInfo> {
        var result: MutableList<CityGeoInfo> = ArrayList()
        val url = "/geo/1.0/direct?q=$name&limit=5&appid=$appId"
        val response = restTemplate.getForObject(url, Array<CityGeoInfo>::class.java)
        if (response != null) {
            result.addAll(response.toList())
        }
        return result
    }


}