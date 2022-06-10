package com.konopackipio1;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
// Important stereotype annotation
@Component
public class Car {

    private String name;

    // This annotation is part of Java EE, so we need to add appropriate javax
    // dependency
    @PostConstruct
    private void init() {
        this.name = "Zaba";
    }

}
