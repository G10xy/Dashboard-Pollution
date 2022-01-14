package it.giovi.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lit/giovi/service/Command;", "Lorg/springframework/boot/CommandLineRunner;", "repo", "Lit/giovi/persistence/repository/CityRepository;", "(Lit/giovi/persistence/repository/CityRepository;)V", "getRepo", "()Lit/giovi/persistence/repository/CityRepository;", "run", "", "args", "", "", "([Ljava/lang/String;)V", "Dashboard-Pollution"})
@org.springframework.stereotype.Component()
public class Command implements org.springframework.boot.CommandLineRunner {
    @org.jetbrains.annotations.NotNull()
    private final it.giovi.persistence.repository.CityRepository repo = null;
    
    public Command(@org.jetbrains.annotations.NotNull()
    it.giovi.persistence.repository.CityRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public it.giovi.persistence.repository.CityRepository getRepo() {
        return null;
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    java.lang.String... args) {
    }
}