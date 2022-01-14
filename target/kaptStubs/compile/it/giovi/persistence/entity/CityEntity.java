package it.giovi.persistence.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lit/giovi/persistence/entity/CityEntity;", "", "id", "Lorg/bson/types/ObjectId;", "name", "", "lat", "", "lon", "(Lorg/bson/types/ObjectId;Ljava/lang/String;DD)V", "getId", "()Lorg/bson/types/ObjectId;", "getLat", "()D", "getLon", "getName", "()Ljava/lang/String;", "Dashboard-Pollution"})
@org.springframework.data.mongodb.core.mapping.Document(collection = "pollution-coll")
public final class CityEntity {
    @org.jetbrains.annotations.NotNull()
    @org.springframework.data.annotation.Id()
    private final org.bson.types.ObjectId id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final double lat = 0.0;
    private final double lon = 0.0;
    
    public CityEntity(@org.jetbrains.annotations.NotNull()
    org.bson.types.ObjectId id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, double lat, double lon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bson.types.ObjectId getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final double getLat() {
        return 0.0;
    }
    
    public final double getLon() {
        return 0.0;
    }
}