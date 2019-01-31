package com.kodilla.good.patterns.challenges.airport;

import static com.kodilla.good.patterns.challenges.airport.Company.getflights;

public class AirMain {
    public static void main(String[] args) {
        //User user = new User("Piotrek" , "Szczepanski" , "Kraków" , "Gdansk" , "");
        User user1 = new User("Margiola", "Szczepanska" , "Szczecin" , "Kraków" , "Warszawa" );
        GenerateUser generateUser = new GenerateUser();
        User user = generateUser.generate();
        Company company = new Company();

        FlightSearch flightSearch = new FromCity();
        flightSearch.findFlights(getflights(), user, "");

        System.out.println();

        FlightSearch flightSearch1 = new ToCity();
        flightSearch1.findFlights(getflights(), user, "");

        FlightSearch flightSearch2 = new ConnectingFlights();
        flightSearch2.findFlights(getflights(), user1, user1.getChangeCity());
    }
}
