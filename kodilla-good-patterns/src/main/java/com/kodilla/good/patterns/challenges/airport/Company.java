package com.kodilla.good.patterns.challenges.airport;
import java.util.*;

public final class Company {
    private final static Map<Integer,Airport> flights = new HashMap<>();

    public Company(){
        flights.put(1,new Airport("KRAKOW", "WARSZAWA"));
        flights.put(2,new Airport("KRAKOW" , "WROCŁAW"));
        flights.put(3,new Airport("WARSZAWA" , "KRAKOW"));
        flights.put(4,new Airport("WROCŁAW" , "KRAKOW"));
        flights.put(5,new Airport("KRAKOW" , "KROSNO-RZESZOW"));
        flights.put(6,new Airport("KRAKOW" , "RZESZOW-KROSNO"));
        flights.put(7,new Airport("KRAKOW","WARSZAWA-GDANSK"));
        flights.put(8,new Airport("KRAKO" ,"GDANSK-SZCZECIN"));
        flights.put(9,new Airport("SZCZECIN", "WARSZAWA"));
    }

    public static HashMap<Integer, Airport> getflights() {
        return new HashMap<Integer, Airport>(flights);
    }



}
