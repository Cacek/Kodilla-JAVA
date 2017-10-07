package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Continent> theWorld = new ArrayList<>();
        List<Country> theCountries = new ArrayList<>();

        Country Poland = new Country(new BigDecimal("1"));
        Country Germany = new Country(new BigDecimal("1"));

        Country Indie = new Country(new BigDecimal("2"));
        Country Chiny = new Country(new BigDecimal("2"));

        Country Egipt = new Country(new BigDecimal("3"));
        Country Kenia = new Country(new BigDecimal("3"));

        Continent europe = new Continent();
        europe.theCountries.add(Germany);
        europe.theCountries.add(Poland);

        Continent asia = new Continent();
        asia.theCountries.add(Indie);
        asia.theCountries.add(Chiny);

        Continent africa = new Continent();
        africa.theCountries.add(Egipt);
        africa.theCountries.add(Kenia);

        World world = new World();
        world.theWorld.add(europe);
        world.theWorld.add(asia);
        world.theWorld.add(africa);

        //When
        BigDecimal total = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("12" );
        Assert.assertEquals(expectedPeopleQuantity, total);
    }
}
