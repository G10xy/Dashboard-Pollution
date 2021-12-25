package it.giovi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class DashboardPollutionApplication

fun main(args: Array<String>) {
	runApplication<DashboardPollutionApplication>(*args)
}
