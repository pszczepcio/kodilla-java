package com.kodilla.good.patterns.challenges.airport;

public class GenerateUser {
    //
    public User generate() {
        String name = "Piotr";
        String surName = "Szczepanski";
        String departureAirport = "Kraków";
        String arrivalAirport = "Gdansk";
        return new User(name, surName, new Airport(departureAirport, arrivalAirport));
    }

    public User generate1() {
        String name = "Mariola";
        String surName = "Szczepanska";
        String departureAirport = "Szczecin";
        String arrivalAirport = "Warszawa";
        return new User(name, surName, new Airport(departureAirport, arrivalAirport));
    }


    public User generate2() {
        String name = "Mariola";
        String surName = "Szczepanska";
        String departureAirport = "Kraków";
        String arrivalAirport = "KROSNO-RZESZÓW";
        return new User(name, surName, new Airport(departureAirport, arrivalAirport));
    }
}
