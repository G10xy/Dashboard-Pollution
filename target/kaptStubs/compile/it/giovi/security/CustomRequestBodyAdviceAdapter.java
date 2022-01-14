package it.giovi.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J<\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011H\u0016J,\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lit/giovi/security/CustomRequestBodyAdviceAdapter;", "Lorg/springframework/web/servlet/mvc/method/annotation/RequestBodyAdviceAdapter;", "filterLoggingService", "Lit/giovi/service/filter/FilterLoggingService;", "httpServletRequest", "Ljavax/servlet/http/HttpServletRequest;", "(Lit/giovi/service/filter/FilterLoggingService;Ljavax/servlet/http/HttpServletRequest;)V", "afterBodyRead", "", "body", "inputMessage", "Lorg/springframework/http/HttpInputMessage;", "parameter", "Lorg/springframework/core/MethodParameter;", "targetType", "Ljava/lang/reflect/Type;", "converterType", "Ljava/lang/Class;", "Lorg/springframework/http/converter/HttpMessageConverter;", "supports", "", "methodParameter", "type", "Dashboard-Pollution"})
@org.springframework.web.bind.annotation.ControllerAdvice()
public class CustomRequestBodyAdviceAdapter extends org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdviceAdapter {
    private final it.giovi.service.filter.FilterLoggingService filterLoggingService = null;
    private final javax.servlet.http.HttpServletRequest httpServletRequest = null;
    
    public CustomRequestBodyAdviceAdapter(@org.jetbrains.annotations.NotNull()
    it.giovi.service.filter.FilterLoggingService filterLoggingService, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest httpServletRequest) {
        super();
    }
    
    @java.lang.Override()
    public boolean supports(@org.jetbrains.annotations.NotNull()
    org.springframework.core.MethodParameter methodParameter, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type, @org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends org.springframework.http.converter.HttpMessageConverter<?>> converterType) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object afterBodyRead(@org.jetbrains.annotations.NotNull()
    java.lang.Object body, @org.jetbrains.annotations.NotNull()
    org.springframework.http.HttpInputMessage inputMessage, @org.jetbrains.annotations.NotNull()
    org.springframework.core.MethodParameter parameter, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type targetType, @org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends org.springframework.http.converter.HttpMessageConverter<?>> converterType) {
        return null;
    }
}