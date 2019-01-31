package com.kodilla.good.patterns.challenges.airport;


import java.util.Objects;

public final class Flight {
    private final String flight;
    private final String numberFlight;

    public Flight(final String flight, final String numberFlight) {
        this.flight = flight;
        this.numberFlight = numberFlight;
    }

    public String getFlight() {
        return flight;
    }

    public String getNumberFlight() {
        return numberFlight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight1 = (Flight) o;
        return Objects.equals(getFlight(), flight1.getFlight()) &&
                Objects.equals(getNumberFlight(), flight1.getNumberFlight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlight(), getNumberFlight());
    }
}
