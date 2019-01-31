package com.kodilla.good.patterns.challenges.airport;

import java.util.Map;

public class ConnectingFlights implements FlightSearch {
    @Override
    public void findFlights(Map<Integer, Flight> list, User user , String connectingCity) {
        System.out.println("Flights with connecting flights from " + user.getFromCity() + " to " + user.getToCity() +" :");
        list.entrySet().stream()
                .map(e -> e.getValue().getFlight())
                .filter(e -> (e.substring(0 , e.indexOf('-')).equals(user.getFromCity().toUpperCase())) && (e.substring((e.length() - user.getToCity().length()) , e.length() ).equals(user.getToCity().toUpperCase())))
                .forEach(System.out::println);
        System.out.println();
    }
}
