package it.giovi.web.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\b\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lit/giovi/web/controller/ControllerImpl;", "Lit/giovi/web/controller/Controller;", "cityService", "Lit/giovi/service/CityService;", "(Lit/giovi/service/CityService;)V", "pollutionData", "", "Lcom/example/model/DashboardResponse;", "startDashboard", "Lorg/springframework/web/servlet/ModelAndView;", "Dashboard-Pollution"})
@org.springframework.web.bind.annotation.RestController()
public class ControllerImpl implements it.giovi.web.controller.Controller {
    private final it.giovi.service.CityService cityService = null;
    
    public ControllerImpl(@org.jetbrains.annotations.NotNull()
    it.giovi.service.CityService cityService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/dashboard"})
    public org.springframework.web.servlet.ModelAndView startDashboard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/pollutionData"})
    public java.util.Collection<com.example.model.DashboardResponse> pollutionData() {
        return null;
    }
}