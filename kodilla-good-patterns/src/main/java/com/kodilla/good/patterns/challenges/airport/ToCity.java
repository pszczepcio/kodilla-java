package com.kodilla.good.patterns.challenges.airport;

import java.util.Map;

public class ToCity implements FlightSearch {
    private User user;
    @Override
    public void findFlights(Map<Integer, Flight> list, User user , String connectingCity) {
        System.out.println("Flights to the city " + user.getToCity() +":");
        list.entrySet().stream()
                .map(e -> e.getValue().getFlight())
                .filter(e -> e.substring((e.length() - user.getToCity().length()) , e.length() ).equals(user.getToCity().toUpperCase()))
                .forEach(System.out::println);
        System.out.println();
    }
}
