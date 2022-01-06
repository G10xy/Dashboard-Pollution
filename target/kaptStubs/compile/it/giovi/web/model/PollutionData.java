package it.giovi.web.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006%"}, d2 = {"Lit/giovi/web/model/PollutionData;", "", "co", "", "no", "no2", "o3", "so2", "pm2_5", "pm10", "nh3", "(DDDDDDDD)V", "getCo", "()D", "getNh3", "getNo", "getNo2", "getO3", "getPm10", "getPm2_5", "getSo2", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Dashboard-Pollution"})
public final class PollutionData {
    private final double co = 0.0;
    private final double no = 0.0;
    private final double no2 = 0.0;
    private final double o3 = 0.0;
    private final double so2 = 0.0;
    private final double pm2_5 = 0.0;
    private final double pm10 = 0.0;
    private final double nh3 = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final it.giovi.web.model.PollutionData copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "co")
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
    
    public PollutionData(@com.fasterxml.jackson.annotation.JsonProperty(value = "co")
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
    
    public final double component1() {
        return 0.0;
    }
    
    public final double getCo() {
        return 0.0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getNo() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getNo2() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getO3() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getSo2() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getPm2_5() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getPm10() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getNh3() {
        return 0.0;
    }
}