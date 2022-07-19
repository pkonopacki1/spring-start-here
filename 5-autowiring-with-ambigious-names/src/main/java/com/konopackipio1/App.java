package com.konopackipio1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        // Creating context and choosing the configuration class
        var context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println(person);

        context.close();
    }
}
