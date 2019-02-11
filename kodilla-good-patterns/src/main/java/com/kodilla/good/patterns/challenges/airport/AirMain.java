package com.kodilla.good.patterns.challenges.airport;
import static com.kodilla.good.patterns.challenges.airport.Company.getflights;

public class AirMain {
    //
    public static void main(String[] args) {
        GenerateUser generateUser = new GenerateUser();
        User user = generateUser.generate();
        User user1 = generateUser.generate1();
        User user2 = generateUser.generate2();
        Company company = new Company();
        FlightSearch flightSearch = new FlightSearch(user);
        flightSearch.searchFlightFrom(getflights());

        FlightSearch flightSearch1 = new FlightSearch(user1);
        flightSearch1.searchFlightTo(getflights());

        FlightSearch flightSearch2 = new FlightSearch(user2);
        flightSearch2.searchConnectingFlight(getflights());
    }
}
