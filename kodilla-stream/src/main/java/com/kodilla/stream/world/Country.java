package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    BigDecimal bigDecimal;

    public Country(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public BigDecimal getPeopleQuantity() {
        return bigDecimal;
    }

}

