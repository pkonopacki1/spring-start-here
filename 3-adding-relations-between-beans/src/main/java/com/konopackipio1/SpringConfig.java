package com.konopackipio1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Informing spring that this is a config class
@Configuration
public class SpringConfig {

    // Adding object to spring context
    @Bean
    Car car() {
        Car car = new Car();
        car.setName("Zaba");
        return car;
    }

    @Bean
    Person person() {
        Person person = new Person("Piotr");
        // Wiring beans through code
        person.setCar(car());
        return person;
    }

}
