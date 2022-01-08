package it.giovi.web.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lit/giovi/web/controller/Controller;", "", "pollutionData", "", "Lcom/example/model/DashboardResponse;", "startDashboard", "Lorg/springframework/web/servlet/ModelAndView;", "Dashboard-Pollution"})
public abstract interface Controller {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.springframework.web.servlet.ModelAndView startDashboard();
    
    @org.jetbrains.annotations.NotNull()
    @io.swagger.v3.oas.annotations.responses.ApiResponses(value = {@io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", content = {@io.swagger.v3.oas.annotations.media.Content(mediaType = "application/json", array = @io.swagger.v3.oas.annotations.media.ArraySchema(schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = com.example.model.DashboardResponse.class)))}, description = "Found pollution data"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", content = {@io.swagger.v3.oas.annotations.media.Content()}, description = "Bad request"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", content = {@io.swagger.v3.oas.annotations.media.Content()}, description = "Did not find any cities\' data"), @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", content = {@io.swagger.v3.oas.annotations.media.Content()}, description = "Internal Server")})
    @io.swagger.v3.oas.annotations.Operation(summary = "Get all pollution data")
    public abstract java.util.Collection<com.example.model.DashboardResponse> pollutionData();
}