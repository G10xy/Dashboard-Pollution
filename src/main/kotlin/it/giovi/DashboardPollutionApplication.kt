package it.giovi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
import java.util.concurrent.Executor


@EnableAsync
@SpringBootApplication
class DashboardPollutionApplication

fun main(args: Array<String>) {
	runApplication<DashboardPollutionApplication>(*args)
}


