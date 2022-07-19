package com.konopackipio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Person {

    @Autowired
    public Person(@Qualifier("electricCar") Car car) {
        this.car = car;
    }

    private final String name = "Piotr";
    // We tell spring that we want to inject car object from context
    // Using @Autowired on a field is possible but not recommended
    // @Autowired
    private final Car car;

}
