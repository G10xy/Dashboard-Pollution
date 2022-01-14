package it.giovi.security;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0012J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0012R\u000e\u0010\u0006\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lit/giovi/security/FilterMDC;", "Lorg/springframework/web/filter/OncePerRequestFilter;", "requestHeader", "", "responseHeader", "mdcTokenKey", "mdcClientIpKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "doFilterInternal", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "filterChain", "Ljavax/servlet/FilterChain;", "extractClientIP", "extractToken", "Dashboard-Pollution"})
@org.springframework.core.annotation.Order(value = org.springframework.core.Ordered.HIGHEST_PRECEDENCE)
@org.springframework.stereotype.Component()
public class FilterMDC extends org.springframework.web.filter.OncePerRequestFilter {
    private final java.lang.String requestHeader = null;
    private final java.lang.String responseHeader = null;
    private final java.lang.String mdcTokenKey = null;
    private final java.lang.String mdcClientIpKey = null;
    
    public FilterMDC(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${mdc.request.header}")
    java.lang.String requestHeader, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${mdc.response.header}")
    java.lang.String responseHeader, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${mdc.token}")
    java.lang.String mdcTokenKey, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Value(value = "${mdc.clientIP}")
    java.lang.String mdcClientIpKey) {
        super();
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class, javax.servlet.ServletException.class})
    @java.lang.Override()
    protected void doFilterInternal(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    javax.servlet.FilterChain filterChain) throws java.io.IOException, javax.servlet.ServletException {
    }
    
    private java.lang.String extractToken(javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    private java.lang.String extractClientIP(javax.servlet.http.HttpServletRequest request) {
        return null;
    }
}