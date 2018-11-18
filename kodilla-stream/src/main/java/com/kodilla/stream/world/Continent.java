package com.kodilla.stream.world;

import java.util.List;
import java.util.ArrayList;

public final class Continent {
   // private final Country country;
    private final List<Country> nameOfContinent = new ArrayList<>();

    public void addCountry(Country country){
        nameOfContinent.add(country);
    }

    public List<Country> getNameOfContinent() {
        return nameOfContinent;
    }

}
