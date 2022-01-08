package it.giovi.web.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0012J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lit/giovi/web/service/CityService;", "", "restService", "Lit/giovi/web/service/RestService;", "(Lit/giovi/web/service/RestService;)V", "mapConverter", "Lcom/example/service/MapConverter;", "getMapConverter", "()Lcom/example/service/MapConverter;", "createFuturesRestCalls", "", "Ljava/util/concurrent/CompletableFuture;", "Lit/giovi/web/model/ResponseApiWeatherData;", "cities", "", "Lit/giovi/web/entity/City;", "getData", "Lcom/example/model/DashboardResponse;", "Dashboard-Pollution"})
@org.springframework.stereotype.Service()
public class CityService {
    private it.giovi.web.service.RestService restService;
    @org.jetbrains.annotations.NotNull()
    private final com.example.service.MapConverter mapConverter = null;
    
    public CityService(@org.jetbrains.annotations.NotNull()
    it.giovi.web.service.RestService restService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.example.service.MapConverter getMapConverter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Collection<com.example.model.DashboardResponse> getData() {
        return null;
    }
    
    private java.util.List<java.util.concurrent.CompletableFuture<it.giovi.web.model.ResponseApiWeatherData>> createFuturesRestCalls(java.util.Collection<it.giovi.web.entity.City> cities) {
        return null;
    }
}