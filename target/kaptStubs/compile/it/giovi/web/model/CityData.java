package it.giovi.web.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lit/giovi/web/model/CityData;", "", "dt", "", "main", "Lit/giovi/web/model/PollutionIndex;", "components", "Lit/giovi/web/model/PollutionData;", "(JLit/giovi/web/model/PollutionIndex;Lit/giovi/web/model/PollutionData;)V", "getComponents", "()Lit/giovi/web/model/PollutionData;", "getDt", "()J", "getMain", "()Lit/giovi/web/model/PollutionIndex;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Dashboard-Pollution"})
public final class CityData {
    private final long dt = 0L;
    @org.jetbrains.annotations.NotNull()
    private final it.giovi.web.model.PollutionIndex main = null;
    @org.jetbrains.annotations.NotNull()
    private final it.giovi.web.model.PollutionData components = null;
    
    @org.jetbrains.annotations.NotNull()
    public final it.giovi.web.model.CityData copy(@com.fasterxml.jackson.annotation.JsonProperty(value = "dt")
    long dt, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "main")
    it.giovi.web.model.PollutionIndex main, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "components")
    it.giovi.web.model.PollutionData components) {
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
    
    public CityData(@com.fasterxml.jackson.annotation.JsonProperty(value = "dt")
    long dt, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "main")
    it.giovi.web.model.PollutionIndex main, @org.jetbrains.annotations.NotNull()
    @com.fasterxml.jackson.annotation.JsonProperty(value = "components")
    it.giovi.web.model.PollutionData components) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getDt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final it.giovi.web.model.PollutionIndex component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final it.giovi.web.model.PollutionIndex getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final it.giovi.web.model.PollutionData component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final it.giovi.web.model.PollutionData getComponents() {
        return null;
    }
}