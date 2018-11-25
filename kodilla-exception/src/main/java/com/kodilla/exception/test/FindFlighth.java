package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindFlighth {

    private HashMap<String, Boolean> theListOfAirport = new HashMap<String, Boolean>();

    public boolean findFligth(Flight flight) throws RouteNotFoundException {
        theListOfAirport.put("Kraków", true);
        theListOfAirport.put("Warszawa", true);
        theListOfAirport.put("Poznań", false);


                if (theListOfAirport.get(flight.getArrivalAirport()) != null) {
                    if(theListOfAirport.get(flight.getArrivalAirport())){
                    System.out.println("There is a flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
                } else {
                    System.out.println("There isn't a flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
                    return theListOfAirport.get(flight.getArrivalAirport());
                }
            } else {
                throw new RouteNotFoundException("The object in arrivalAirport is null");
            }
        return theListOfAirport.get(flight.getArrivalAirport());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FindFlighth)) return false;
        FindFlighth that = (FindFlighth) o;
        return Objects.equals(theListOfAirport, that.theListOfAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theListOfAirport);
    }
}
