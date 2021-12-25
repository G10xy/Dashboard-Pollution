package it.giovi.web

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import org.springframework.web.util.UriComponentsBuilder

class RestService {

    @Value("\${wheather.secret-key}")
    val apiSecretKey: String = ""

    val client: WebClient

    constructor() {
        this.client = WebClient.create()
    }


    suspend fun prova() : Collection<Pojo> {
        val uri = UriComponentsBuilder
            .fromUriString("http://api.openweathermap.org/geo/1.0/direct")
            .queryParam("q", "{q}").queryParam("limit", "{limit}").queryParam("appId", "{appId}")
            .build("Roma", "5", "157effbf03566be828f8c61b670654e2")

        val response = client.get()
            .uri(uri)
            .accept(MediaType.APPLICATION_JSON)
            .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .retrieve()
            .awaitBody<List<Pojo>>()

        return response
    }
}