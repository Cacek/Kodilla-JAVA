package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    public static List<Continent> theWorld = new ArrayList<>();



    public static void main(String[] args) {
        Country Poland = new Country(new BigDecimal("1234567890"));
        Country Germany = new Country(new BigDecimal("9876543210"));

        Poland.getPeopleQuantity();
        Germany.getPeopleQuantity();

        Continent europe = new Continent();

        europe.theCountries.add(Germany);
        europe.theCountries.add(Poland);

        World world = new World();
        world.theWorld.add(europe);

        BigDecimal test = theWorld.stream()
                .flatMap(europe);

    }


}
