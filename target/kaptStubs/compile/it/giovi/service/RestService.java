package it.giovi.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lit/giovi/service/RestService;", "", "restTemplate", "Lorg/springframework/web/client/RestTemplate;", "appId", "", "(Lorg/springframework/web/client/RestTemplate;Ljava/lang/String;)V", "getPollutionData", "Ljava/util/concurrent/CompletableFuture;", "Lit/giovi/web/model/ResponseApiWeatherData;", "name", "lat", "", "lon", "Dashboard-Pollution"})
@org.springframework.stereotype.Service()
public class RestService {
    private final org.springframework.web.client.RestTemplate restTemplate = null;
    private final java.lang.String appId = null;
    
    public RestService(@org.jetbrains.annotations.NotNull()
    org.springframework.web.client.RestTemplate restTemplate, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${appId}")
    java.lang.String appId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.InterruptedException.class})
    @org.springframework.scheduling.annotation.Async(value = "threadPoolForData")
    public java.util.concurrent.CompletableFuture<it.giovi.web.model.ResponseApiWeatherData> getPollutionData(@org.jetbrains.annotations.NotNull()
    java.lang.String name, double lat, double lon) {
        return null;
    }
}