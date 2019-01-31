package com.kodilla.good.patterns.challenges.airport;

public class GenerateUser {
    public User generate() {
        String name = "Piotr";
        String surName = "Szczepanski";
        String flightFrom = "Kraków";
        String flightTp = "Gdansk";
        String changeCity = "";
        return new User(name, surName, flightFrom, flightTp, changeCity);
    }

    public User generate1() {
        String name = "Mariola";
        String surName = "Szczepanska";
        String flightFrom = "Szczeinw";
        String flightTo = "Warszawa";
        String changeCity = "";
        return new User(name, surName, flightFrom, flightTo, changeCity);
    }

    public User generate2() {
        String name = "Mariola";
        String surName = "Szczepanska";
        String flightFrom = "Kraków";
        String flightTo = "Rzeszów";
        String changeCity = "Krosno";
        return new User(name, surName, flightFrom, flightTo, changeCity);
    }
}
