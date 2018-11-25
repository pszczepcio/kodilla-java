package com.kodilla.exception.test;

public class NotAirportOnTheList {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Poznań", "Krosno");
        FindFlighth find1 = new FindFlighth();

        try {
            find1.findFligth(flight1);
        }catch(RouteNotFoundException e){
            System.out.println("There isn't this airport on the airports list.");
        }
    }
}
