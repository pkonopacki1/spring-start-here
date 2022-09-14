package com.konopackipio1.ch10rest;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Country {
    private String name;
    private int population;

    public static Country of(
            String name,
            int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }
}
