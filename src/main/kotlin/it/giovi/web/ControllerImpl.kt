package it.giovi.web

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ControllerImpl {

    @GetMapping("/api")
    fun ciao(@RequestParam("nome") nome: String) : String {
        return "ciao $nome"
    }

    @GetMapping("/api/prova", produces = [MediaType.APPLICATION_JSON_VALUE])
    suspend fun test(): Collection<Pojo> {
        val rest = RestService()
        return rest.prova()
    }
}