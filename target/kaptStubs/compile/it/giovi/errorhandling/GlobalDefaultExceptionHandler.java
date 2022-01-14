package it.giovi.errorhandling;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lit/giovi/errorhandling/GlobalDefaultExceptionHandler;", "Lorg/springframework/web/servlet/mvc/method/annotation/ResponseEntityExceptionHandler;", "()V", "logger", "Lmu/KLogger;", "handleError", "Lorg/springframework/web/servlet/ModelAndView;", "req", "Ljavax/servlet/http/HttpServletRequest;", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Dashboard-Pollution"})
@org.springframework.web.bind.annotation.ControllerAdvice()
@org.springframework.web.servlet.config.annotation.EnableWebMvc()
public class GlobalDefaultExceptionHandler extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {
    private final mu.KLogger logger = null;
    
    public GlobalDefaultExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {java.lang.Exception.class})
    public org.springframework.web.servlet.ModelAndView handleError(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest req, @org.jetbrains.annotations.NotNull()
    java.lang.Exception ex) throws java.lang.Exception {
        return null;
    }
}