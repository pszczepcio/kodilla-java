package com.kodilla.good.patterns.challenges.airport;

import java.util.HashMap;
import java.util.Map;

public class FromCity implements FlightSearch {


    @Override
    public void findFlights(final Map<Integer, Flight> list , User user , String connectingCity) {
        System.out.println("Departures from the city " + user.getFromCity() +":");
        list.entrySet().stream()
                .map(e->e.getValue().getFlight())
                .filter(e->e.substring(0 , e.indexOf('-')).equals(user.getFromCity().toUpperCase()))
                .forEach(System.out::println);
        System.out.println();
    }
}
