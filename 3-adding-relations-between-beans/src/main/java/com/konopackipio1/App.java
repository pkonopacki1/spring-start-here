package com.konopackipio1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        // Creating context and choosing the configuration class
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Car car = context.getBean(Car.class);
        String hello = context.getBean(String.class);

        System.out.println(car.getName());
        System.out.println(hello);

        context.close();
    }
}
