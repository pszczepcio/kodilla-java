package com.kodilla.good.patterns.challenges.airport;

public final class User {
    private final String name;
    private final String surName;
    private final String fromCity;
    private final String toCity;
    private final String changeCity;

    public User(final String name, final String surName, final String fromCity, final String toCity, final String changeCity) {
        this.name = name;
        this.surName = surName;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.changeCity = changeCity;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public String getChangeCity() {
        return changeCity;
    }
}
