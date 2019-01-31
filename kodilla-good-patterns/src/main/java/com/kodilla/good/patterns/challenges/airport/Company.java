package com.kodilla.good.patterns.challenges.airport;

import java.util.*;

public final class Company {
    private final String placeCompany = "KRAKÓW";
    private final static Map<Integer,Flight> flights = new HashMap<>();

    public Company(){
        flights.put(1,new Flight("KRAKÓW-WARSZAWA" , "11"));
        flights.put(2,new Flight("KRAKÓW-WROCŁAW" , "22"));
        flights.put(3,new Flight("WARSZAWA-KRAKÓW" , "33"));
        flights.put(4,new Flight("WROCŁAW-KRAKÓW" , "44"));
        flights.put(5,new Flight("KRAKÓW-KROSNO-RZESZÓW" , "55"));
        flights.put(6,new Flight("KRAKÓW-RZESZÓW-KROSNO" , "66"));
        flights.put(7,new Flight("KRAKÓW-WARSZAWA-GDANSK","77"));
        flights.put(8,new Flight("KRAKÓW-GDANSK-SZCZECIN" ,"88"));
        flights.put(9,new Flight("SZCZECIN-WARSZAWA-KRAKÓW", "99"));
    }
    public String getPlaceCompany() {
        return placeCompany;
    }

    public static Map<Integer, Flight> getflights() {
        return new HashMap<Integer, Flight>(flights);
    }



}
