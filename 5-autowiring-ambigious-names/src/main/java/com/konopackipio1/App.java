package com.konopackipio1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        // Creating context and choosing the configuration class
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Car car = context.getBean(Car.class);
        Person person = context.getBean(Person.class);

        System.out.println(car);
        System.out.println(person);

        context.close();
    }
}
