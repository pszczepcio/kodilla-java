package com.kodilla.good.patterns.challenges.airport;
import java.util.Objects;

public final class Airport {
    private final String departureAirport;
    private final String arrivalAirport;

    public Airport(final String departureAirport, final String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;
        Airport airport = (Airport) o;
        return Objects.equals(getDepartureAirport(), airport.getDepartureAirport()) &&
                Objects.equals(getArrivalAirport(), airport.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAirport(), getArrivalAirport());
    }
}
