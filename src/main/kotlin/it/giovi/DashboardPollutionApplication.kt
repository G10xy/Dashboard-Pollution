package it.giovi

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
import java.util.concurrent.Executor


@EnableAsync
@EnableMongoRepositories(basePackages = ["it.giovi.persistence"])
@EnableEncryptableProperties
@SpringBootApplication
class DashboardPollutionApplication

fun main(args: Array<String>) {
	runApplication<DashboardPollutionApplication>(*args)
}


