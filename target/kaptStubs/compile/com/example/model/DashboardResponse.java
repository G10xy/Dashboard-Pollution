package com.example.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\b\u0012\b\b\u0001\u0010\f\u001a\u00020\b\u0012\b\b\u0001\u0010\r\u001a\u00020\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\b\u0012\b\b\u0001\u0010\u000f\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\t\u0010\'\u001a\u00020\bH\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\t\u0010,\u001a\u00020\bH\u00c6\u0003J\t\u0010-\u001a\u00020\bH\u00c6\u0003J\t\u0010.\u001a\u00020\bH\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003J\u0082\u0001\u00100\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\b2\b\b\u0003\u0010\u000e\u001a\u00020\b2\b\b\u0003\u0010\u000f\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0005H\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001b\u00a8\u00067"}, d2 = {"Lcom/example/model/DashboardResponse;", "", "city", "", "aqi", "", "date", "co", "", "no", "no2", "o3", "so2", "pm2_5", "pm10", "nh3", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;DDDDDDDD)V", "getAqi", "()Ljava/lang/Integer;", "setAqi", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "getCo", "()D", "getDate", "setDate", "getNh3", "getNo", "getNo2", "getO3", "getPm10", "getPm2_5", "getSo2", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;DDDDDDDD)Lcom/example/model/DashboardResponse;", "equals", "", "other", "hashCode", "toString", "Dashboard-Pollution"})
@io.swagger.v3.oas.annotations.media.Schema(description = "Model about city pollution data.")
public final class DashboardResponse {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String city;
    @org.jetbrains.annotations.Nullable()
    @io.swagger.v3.oas.annotations.media.Schema(description = "Air Quality Index, see more: https://en.wikipedia.org/wiki/Air_quality_index", type = "int", minimum = "1", maximum = "5")
    private java.lang.Integer aqi;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String date;
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
    java.lang.String date, @com.fasterxml.jackson.annotation.JsonProperty(value = "co")
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
    java.lang.String date, @com.fasterxml.jackson.annotation.JsonProperty(value = "co")
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
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
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