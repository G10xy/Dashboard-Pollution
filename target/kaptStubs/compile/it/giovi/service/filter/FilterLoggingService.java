package it.giovi.service.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&J$\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&\u00a8\u0006\n"}, d2 = {"Lit/giovi/service/filter/FilterLoggingService;", "", "logRequest", "", "httpServletRequest", "Ljavax/servlet/http/HttpServletRequest;", "body", "logResponse", "httpServletResponse", "Ljavax/servlet/http/HttpServletResponse;", "Dashboard-Pollution"})
public abstract interface FilterLoggingService {
    
    public abstract void logRequest(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest httpServletRequest, @org.jetbrains.annotations.Nullable()
    java.lang.Object body);
    
    public abstract void logResponse(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest httpServletRequest, @org.jetbrains.annotations.Nullable()
    javax.servlet.http.HttpServletResponse httpServletResponse, @org.jetbrains.annotations.Nullable()
    java.lang.Object body);
}