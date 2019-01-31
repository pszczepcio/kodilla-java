package com.kodilla.good.patterns.challenges.airport;

import static com.kodilla.good.patterns.challenges.airport.Company.getflights;

public class AirMain {
    public static void main(String[] args) {
        GenerateUser generateUser = new GenerateUser();
        User user = generateUser.generate();
        User user1 = generateUser.generate1();
        User user2 = generateUser.generate2();

        Company company = new Company();

        FlightSearch flightSearch = new FromCity();
        flightSearch.findFlights(getflights(), user, "");

        FlightSearch flightSearch1 = new ToCity();
        flightSearch1.findFlights(getflights(), user1, "");

        FlightSearch flightSearch2 = new ConnectingFlights();
        flightSearch2.findFlights(getflights(), user2, user2.getChangeCity());
    }
}
