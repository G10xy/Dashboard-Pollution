package it.giovi.service.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0012J\u001e\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0012J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\r\u001a\u00020\tH\u0012J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J$\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lit/giovi/service/filter/FilterLoggingServiceImpl;", "Lit/giovi/service/filter/FilterLoggingService;", "()V", "logger", "Lmu/KLogger;", "buildHeadersMap", "", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "buildParametersMap", "httpServletRequest", "logRequest", "", "body", "", "logResponse", "httpServletResponse", "Dashboard-Pollution"})
@org.springframework.stereotype.Service()
public class FilterLoggingServiceImpl implements it.giovi.service.filter.FilterLoggingService {
    private final mu.KLogger logger = null;
    
    public FilterLoggingServiceImpl() {
        super();
    }
    
    @java.lang.Override()
    public void logRequest(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest httpServletRequest, @org.jetbrains.annotations.Nullable()
    java.lang.Object body) {
    }
    
    @java.lang.Override()
    public void logResponse(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest httpServletRequest, @org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletResponse httpServletResponse, @org.jetbrains.annotations.Nullable()
    java.lang.Object body) {
    }
    
    private java.util.Map<java.lang.String, java.lang.String> buildParametersMap(javax.servlet.http.HttpServletRequest httpServletRequest) {
        return null;
    }
    
    private java.util.Map<java.lang.String, java.lang.String> buildHeadersMap(javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    private java.util.Map<java.lang.String, java.lang.String> buildHeadersMap(javax.servlet.http.HttpServletResponse response) {
        return null;
    }
}