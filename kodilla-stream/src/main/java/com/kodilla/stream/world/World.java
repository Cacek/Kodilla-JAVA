package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    public List<Continent> theWorld = new ArrayList<>();

    public final BigDecimal getPeopleQuantity() {

        BigDecimal total = theWorld.stream()
                .flatMap(continent -> continent.theCountries.stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return total;
    }

    public List<Continent> getTheWorld() {
        return theWorld;
    }
}