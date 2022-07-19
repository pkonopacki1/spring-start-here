package com.konopackipio1;

import org.springframework.stereotype.Component;

@Component("electricCar")
public class ElectricCar extends Car {

    public ElectricCar() {
        setName("Electric Zaba");
    }
}
