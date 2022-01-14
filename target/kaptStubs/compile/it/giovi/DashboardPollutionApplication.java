package it.giovi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lit/giovi/DashboardPollutionApplication;", "", "()V", "Dashboard-Pollution"})
@org.springframework.boot.autoconfigure.SpringBootApplication()
@org.springframework.data.mongodb.repository.config.EnableMongoRepositories(basePackages = {"it.giovi.persistence"})
@org.springframework.scheduling.annotation.EnableAsync()
public class DashboardPollutionApplication {
    
    public DashboardPollutionApplication() {
        super();
    }
}