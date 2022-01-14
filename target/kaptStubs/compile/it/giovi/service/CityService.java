package it.giovi.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0012J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lit/giovi/service/CityService;", "", "restService", "Lit/giovi/service/RestService;", "repo", "Lit/giovi/persistence/repository/CityRepository;", "(Lit/giovi/service/RestService;Lit/giovi/persistence/repository/CityRepository;)V", "mapConverter", "Lit/giovi/service/mapper/MapConverter;", "getMapConverter", "()Lit/giovi/service/mapper/MapConverter;", "createFuturesRestCalls", "", "Ljava/util/concurrent/CompletableFuture;", "Lit/giovi/web/model/ResponseApiWeatherData;", "cities", "", "Lit/giovi/persistence/entity/CityEntity;", "getData", "Lcom/example/model/DashboardResponse;", "Dashboard-Pollution"})
@org.springframework.stereotype.Service()
public class CityService {
    private it.giovi.service.RestService restService;
    private it.giovi.persistence.repository.CityRepository repo;
    @org.jetbrains.annotations.NotNull()
    private final it.giovi.service.mapper.MapConverter mapConverter = null;
    
    public CityService(@org.jetbrains.annotations.NotNull()
    it.giovi.service.RestService restService, @org.jetbrains.annotations.NotNull()
    it.giovi.persistence.repository.CityRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public it.giovi.service.mapper.MapConverter getMapConverter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Collection<com.example.model.DashboardResponse> getData() {
        return null;
    }
    
    private java.util.List<java.util.concurrent.CompletableFuture<it.giovi.web.model.ResponseApiWeatherData>> createFuturesRestCalls(java.util.Collection<it.giovi.persistence.entity.CityEntity> cities) {
        return null;
    }
}