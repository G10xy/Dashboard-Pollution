package com.example.service;

import java.lang.System;

@org.mapstruct.Mapper()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/service/MapConverter;", "", "pollutionDataDtoToResponse", "Lcom/example/model/DashboardResponse;", "data", "Lit/giovi/web/model/PollutionData;", "Dashboard-Pollution"})
public abstract interface MapConverter {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.model.DashboardResponse pollutionDataDtoToResponse(@org.jetbrains.annotations.NotNull()
    it.giovi.web.model.PollutionData data);
}