package com.kodilla.stream.forum.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.concurrent.Callable;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //GIVEN
        //Create a Countries
        Country Poland = new Country(new BigDecimal("999999"));
        Country Germany = new Country(new BigDecimal("888888"));
        Country China = new Country(new BigDecimal("9999999"));
        Country India = new Country(new BigDecimal("77777"));
        Country USA = new Country(new BigDecimal("9999999"));
        Country Canada = new Country(new BigDecimal("878788787"));
        Country RPA = new Country(new BigDecimal("767676767"));
        Country Egypt = new Country(new BigDecimal("5555555"));
        Country Brazil = new Country(new BigDecimal("666666444"));
        Country Argentina = new Country(new BigDecimal("6666666"));
        Country Australia = new Country(new BigDecimal("989898989"));
        //Create Continents
        Continent europe = new Continent();
        europe.addCountry(Poland);
        europe.addCountry(Germany);

        Continent asia = new Continent();
        asia.addCountry(China);
        asia.addCountry(India);

        Continent northAmerica = new Continent();
        northAmerica.addCountry(USA);
        northAmerica.addCountry(Canada);

        Continent southAmerica = new Continent();
        southAmerica.addCountry(Brazil);
        southAmerica.addCountry(Argentina);

        Continent africa = new Continent();
        africa.addCountry(Egypt);
        africa.addCountry(RPA);

        Continent australia = new Continent();
        australia.addCountry(Australia);

        // Create a list of Continent
        World wordl = new World();
        wordl.addContinent(europe);
        wordl.addContinent(africa);
        wordl.addContinent(asia);
        wordl.addContinent(australia);
        wordl.addContinent(southAmerica);
        wordl.addContinent(northAmerica);

        //WHEN
        BigDecimal totalPeople = (BigDecimal) wordl.getContinentList().stream()
                .flatMap(continent -> continent.getNameOfContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current) -> sum.add(current));

        //Then
        BigDecimal peopleOnTheWorld = new BigDecimal("3337219870");
        Assert.assertEquals(peopleOnTheWorld,totalPeople);
    }
}
