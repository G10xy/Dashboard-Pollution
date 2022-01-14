package it.giovi.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lit/giovi/security/LogInterceptor;", "Lorg/springframework/web/servlet/HandlerInterceptor;", "filterLoggingService", "Lit/giovi/service/filter/FilterLoggingService;", "(Lit/giovi/service/filter/FilterLoggingService;)V", "preHandle", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "handler", "", "Dashboard-Pollution"})
@org.springframework.stereotype.Component()
public class LogInterceptor implements org.springframework.web.servlet.HandlerInterceptor {
    private final it.giovi.service.filter.FilterLoggingService filterLoggingService = null;
    
    public LogInterceptor(@org.jetbrains.annotations.NotNull()
    it.giovi.service.filter.FilterLoggingService filterLoggingService) {
        super();
    }
    
    @java.lang.Override()
    public boolean preHandle(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    java.lang.Object handler) {
        return false;
    }
}