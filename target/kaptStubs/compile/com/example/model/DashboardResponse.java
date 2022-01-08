package com.example.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\t\u0012\b\b\u0001\u0010\u000e\u001a\u00020\t\u0012\b\b\u0001\u0010\u000f\u001a\u00020\t\u0012\b\b\u0001\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\t\u0010*\u001a\u00020\tH\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\tH\u00c6\u0003J\t\u00100\u001a\u00020\tH\u00c6\u0003J\t\u00101\u001a\u00020\tH\u00c6\u0003J\t\u00102\u001a\u00020\tH\u00c6\u0003J\u0082\u0001\u00103\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\t2\b\b\u0003\u0010\r\u001a\u00020\t2\b\b\u0003\u0010\u000e\u001a\u00020\t2\b\b\u0003\u0010\u000f\u001a\u00020\t2\b\b\u0003\u0010\u0010\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0005H\u00d6\u0001J\t\u00109\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\r\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001c\u00a8\u0006:"}, d2 = {"Lcom/example/model/DashboardResponse;", "", "city", "", "aqi", "", "date", "Ljava/time/LocalDateTime;", "co", "", "no", "no2", "o3", "so2", "pm2_5", "pm10", "nh3", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/time/LocalDateTime;DDDDDDDD)V", "getAqi", "()Ljava/lang/Integer;", "setAqi", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "getCo", "()D", "getDate", "()Ljava/time/LocalDateTime;", "setDate", "(Ljava/time/LocalDateTime;)V", "getNh3", "getNo", "getNo2", "getO3", "getPm10", "getPm2_5", "getSo2", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/time/LocalDateTime;DDDDDDDD)Lcom/example/model/DashboardResponse;", "equals", "", "other", "hashCode", "toString", "Dashboard-Pollution"})
@io.swagger.v3.oas.annotations.media.Schema(description = "Model about city pollution data.")
public final class DashboardResponse {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String city;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Air Quality Index, see more: https://en.wikipedia.org/wiki/Air_quality_index", type = "int", minimum = "1", maximum = "5")
    private java.lang.Integer aqi;
    @org.jetbrains.annotations.Nullable()
    private java.time.LocalDateTime date;
    private final double co = 0.0;
    private final double no = 0.0;
    private final double no2 = 0.0;
    private final double o3 = 0.0;
    private final double so2 = 0.0;
    private final double pm2_5 = 0.0;
    private final double pm10 = 0.0;
    private final double nh3 = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.model.DashboardResponse copy(@org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "city")
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "aqi")
    java.lang.Integer aqi, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "date")
    java.time.LocalDateTime date, @com.fasterxml.jackson.annotation.JsonProperty(value = "co")
    double co, @com.fasterxml.jackson.annotation.JsonProperty(value = "no")
    double no, @com.fasterxml.jackson.annotation.JsonProperty(value = "no2")
    double no2, @com.fasterxml.jackson.annotation.JsonProperty(value = "o3")
    double o3, @com.fasterxml.jackson.annotation.JsonProperty(value = "so2")
    double so2, @com.fasterxml.jackson.annotation.JsonProperty(value = "pm2_5")
    double pm2_5, @com.fasterxml.jackson.annotation.JsonProperty(value = "pm10")
    double pm10, @com.fasterxml.jackson.annotation.JsonProperty(value = "nh3")
    double nh3) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public DashboardResponse(@org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "city")
    java.lang.String city, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "aqi")
    java.lang.Integer aqi, @org.jetbrains.annotations.Nullable()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "date")
    java.time.LocalDateTime date, @com.fasterxml.jackson.annotation.JsonProperty(value = "co")
    double co, @com.fasterxml.jackson.annotation.JsonProperty(value = "no")
    double no, @com.fasterxml.jackson.annotation.JsonProperty(value = "no2")
    double no2, @com.fasterxml.jackson.annotation.JsonProperty(value = "o3")
    double o3, @com.fasterxml.jackson.annotation.JsonProperty(value = "so2")
    double so2, @com.fasterxml.jackson.annotation.JsonProperty(value = "pm2_5")
    double pm2_5, @com.fasterxml.jackson.annotation.JsonProperty(value = "pm10")
    double pm10, @com.fasterxml.jackson.annotation.JsonProperty(value = "nh3")
    double nh3) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAqi() {
        return null;
    }
    
    public final void setAqi(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDateTime getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.time.LocalDateTime p0) {
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getCo() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getNo() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getNo2() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getO3() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getSo2() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getPm2_5() {
        return 0.0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double getPm10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double getNh3() {
        return 0.0;
    }
}