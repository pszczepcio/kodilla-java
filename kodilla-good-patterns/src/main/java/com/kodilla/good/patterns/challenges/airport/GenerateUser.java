package com.kodilla.good.patterns.challenges.airport;

public class GenerateUser {
    public User generate(){
        String name = "Piotr";
        String surName = "Szczepanski";
        String flightFrom = "Kraków";
        String flightTp = "Gdansk";
        String changeCity = "";
        return new User(name , surName , flightFrom , flightTp , changeCity);
    }

    public User genrate1(){
        String name = "Mariola";
        String surName = "Szczepanska";
        String flightFrom = "Szczeinw";
        String flightTp = "Warszawa";
        String changeCity = "";
        return new User(name , surName , flightFrom , flightTp , changeCity);
    }
}
