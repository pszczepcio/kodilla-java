package com.kodilla.good.patterns.challenges.airport;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearch {
    //
    private User user;

    public FlightSearch(User user) {
        this.user = user;
    }

    public void searchFlightFrom(final Map<Integer, Airport> departuresFromAirport){
         departuresFromAirport.entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> e.getDepartureAirport().equals(this.user.getAirport().getDepartureAirport().toUpperCase()))
                .map(e->"Departure from : " + e.getDepartureAirport() + ", to : " + e.getArrivalAirport())
                 .forEach(System.out::println);
        System.out.println();
    }

    public void searchFlightTo(final Map<Integer, Airport> arrivalFromAirport){
        arrivalFromAirport.entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> e.getArrivalAirport().equals(this.user.getAirport().getArrivalAirport().toUpperCase()))
                .map(e -> "Arrivale to : " + e.getArrivalAirport() + ", from: " + e.getDepartureAirport())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchConnectingFlight(final Map<Integer, Airport> connectingFlight){
        connectingFlight.entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> (e.getDepartureAirport().equals(this.user.getAirport().getDepartureAirport().toUpperCase()) && (e.getArrivalAirport().equals(this.user.getAirport().getArrivalAirport().toUpperCase()))))
                .map(e -> "Departure from : " + e.getDepartureAirport() + ", to : " + e.getArrivalAirport())
                .forEach(System.out::println);
    }
}
