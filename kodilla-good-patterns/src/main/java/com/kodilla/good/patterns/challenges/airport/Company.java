package com.kodilla.good.patterns.challenges.airport;
import java.util.*;

public final class Company {
    private final static Map<Integer,Airport> flights = new HashMap<>();

    public Company(){
        flights.put(1,new Airport("KRAKÓW", "WARSZAWA"));
        flights.put(2,new Airport("KRAKÓW" , "WROCŁAW"));
        flights.put(3,new Airport("WARSZAWA" , "KRAKÓW"));
        flights.put(4,new Airport("WROCŁAW" , "KRAKÓW"));
        flights.put(5,new Airport("KRAKÓW" , "KROSNO-RZESZÓW"));
        flights.put(6,new Airport("KRAKÓW" , "RZESZÓW-KROSNO"));
        flights.put(7,new Airport("KRAKÓW","WARSZAWA-GDANSK"));
        flights.put(8,new Airport("KRAKÓW" ,"GDANSK-SZCZECIN"));
        flights.put(9,new Airport("SZCZECIN", "WARSZAWA"));
    }

    public static HashMap<Integer, Airport> getflights() {
        return new HashMap<Integer, Airport>(flights);
    }



}
