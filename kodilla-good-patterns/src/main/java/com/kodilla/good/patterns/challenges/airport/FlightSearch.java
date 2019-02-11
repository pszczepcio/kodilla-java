package com.kodilla.good.patterns.challenges.airport;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearch {
    private final HashMap<Integer,Airport> listOfFlights ;
    private User user;

    public FlightSearch(HashMap<Integer,Airport> flights) {
        listOfFlights = flights;
    }

    public void searchFlightFrom(User user){
         listOfFlights.entrySet().stream()
                 .map(e->e.getValue())
                 .filter(e -> e.getDepartureAirport().toUpperCase().equals(user.getAirport().getDepartureAirport().toUpperCase()))
                 .map(e -> "Departure from : " + e.getDepartureAirport() + ", to :" + e.getArrivalAirport())
                 .forEach(System.out::println);
        System.out.println();
    }

    public void searchFlightTo(User user){
        listOfFlights.entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> e.getArrivalAirport().equals(user.getAirport().getArrivalAirport().toUpperCase()))
                .map(e -> "Arrivale to : " + e.getArrivalAirport() + ", from: " + e.getDepartureAirport())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchConnectingFlight(User user){
        listOfFlights.entrySet().stream()
                .map(e -> e.getValue())
                .filter(e -> (e.getDepartureAirport().equals(user.getAirport().getDepartureAirport().toUpperCase()) && (e.getArrivalAirport().equals(user.getAirport().getArrivalAirport().toUpperCase()))))
                .map(e -> "Departure from : " + e.getDepartureAirport() + ", to : " + e.getArrivalAirport())
                .forEach(System.out::println);
    }
}
