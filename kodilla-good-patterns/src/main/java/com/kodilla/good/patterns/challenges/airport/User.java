package com.kodilla.good.patterns.challenges.airport;

public final class User {
    private final String name;
    private final String surName;
    private Airport airport;


    public User(final String name, final String surName, final Airport airport) {
        this.name = name;
        this.surName = surName;
        this.airport = airport;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Airport getAirport() {
        return airport;
    }
}
