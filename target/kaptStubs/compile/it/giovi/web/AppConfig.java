package it.giovi.web;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0017J\b\u0010\n\u001a\u00020\u000bH\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\f"}, d2 = {"Lit/giovi/web/AppConfig;", "", "basicUri", "", "(Ljava/lang/String;)V", "getBasicUri", "()Ljava/lang/String;", "setBasicUri", "restTemplate", "Lorg/springframework/web/client/RestTemplate;", "taskExecutor", "Ljava/util/concurrent/Executor;", "Dashboard-Pollution"})
@org.springframework.context.annotation.Configuration()
public class AppConfig {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String basicUri;
    
    public AppConfig(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${api.uri}")
    java.lang.String basicUri) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getBasicUri() {
        return null;
    }
    
    public void setBasicUri(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.web.client.RestTemplate restTemplate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public java.util.concurrent.Executor taskExecutor() {
        return null;
    }
}