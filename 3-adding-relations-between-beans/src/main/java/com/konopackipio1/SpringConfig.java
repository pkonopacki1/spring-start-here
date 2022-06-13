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

    // Below two alternative ways of wiring beans
    // #1 alternative, using car() method
    // @Bean
    // Person person() {
    // Person person = new Person("Piotr");
    // // Wiring beans through code
    // person.setCar(car());
    // return person;
    // }

    // #2 alterantive, creating method with parameter
    @Bean
    Person person(Car car) {
        Person person = new Person("Piotr");
        person.setCar(car);
        return person;
    }

}
