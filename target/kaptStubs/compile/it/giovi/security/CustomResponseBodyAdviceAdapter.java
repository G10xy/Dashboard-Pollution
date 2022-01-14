package it.giovi.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005JJ\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000e0\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lit/giovi/security/CustomResponseBodyAdviceAdapter;", "Lorg/springframework/web/servlet/mvc/method/annotation/ResponseBodyAdvice;", "", "filterLoggingService", "Lit/giovi/service/filter/FilterLoggingService;", "(Lit/giovi/service/filter/FilterLoggingService;)V", "beforeBodyWrite", "obj", "methodParameter", "Lorg/springframework/core/MethodParameter;", "mediaType", "Lorg/springframework/http/MediaType;", "selectedConverterType", "Ljava/lang/Class;", "Lorg/springframework/http/converter/HttpMessageConverter;", "serverHttpRequest", "Lorg/springframework/http/server/ServerHttpRequest;", "serverHttpResponse", "Lorg/springframework/http/server/ServerHttpResponse;", "supports", "", "returnType", "converterType", "Dashboard-Pollution"})
@org.springframework.web.bind.annotation.ControllerAdvice()
public class CustomResponseBodyAdviceAdapter implements org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice<java.lang.Object> {
    private final it.giovi.service.filter.FilterLoggingService filterLoggingService = null;
    
    public CustomResponseBodyAdviceAdapter(@org.jetbrains.annotations.NotNull()
    it.giovi.service.filter.FilterLoggingService filterLoggingService) {
        super();
    }
    
    @java.lang.Override()
    public boolean supports(@org.jetbrains.annotations.NotNull()
    org.springframework.core.MethodParameter returnType, @org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends org.springframework.http.converter.HttpMessageConverter<?>> converterType) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object beforeBodyWrite(@org.jetbrains.annotations.Nullable()
    @org.springframework.lang.Nullable()
    java.lang.Object obj, @org.jetbrains.annotations.NotNull()
    org.springframework.core.MethodParameter methodParameter, @org.jetbrains.annotations.NotNull()
    org.springframework.http.MediaType mediaType, @org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends org.springframework.http.converter.HttpMessageConverter<?>> selectedConverterType, @org.jetbrains.annotations.NotNull()
    org.springframework.http.server.ServerHttpRequest serverHttpRequest, @org.jetbrains.annotations.NotNull()
    org.springframework.http.server.ServerHttpResponse serverHttpResponse) {
        return null;
    }
}