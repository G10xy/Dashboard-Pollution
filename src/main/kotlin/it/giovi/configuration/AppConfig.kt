package it.giovi.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
import org.springframework.web.client.RestTemplate
import java.time.Duration
import java.util.concurrent.Executor

@Configuration
class AppConfig(@Value("\${api.uri}") var basicUri: String ) {

    @Bean
    fun restTemplate(): RestTemplate = RestTemplateBuilder()
        .rootUri(basicUri).defaultHeader("Accept", MediaType.APPLICATION_JSON_VALUE)
        .setConnectTimeout(Duration.ofSeconds(10))
        .build()


    @Bean(name = ["threadPoolForData"])
    fun taskExecutor(): Executor {
        val executor = ThreadPoolTaskExecutor()
        executor.corePoolSize = 2
        executor.maxPoolSize = 5
        executor.setQueueCapacity(100)
        executor.setThreadNamePrefix("Pollution-")
        executor.initialize()
        return executor
    }
}