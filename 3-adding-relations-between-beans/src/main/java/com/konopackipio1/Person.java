package com.konopackipio1;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Person {

    final private String name;
    private Car car;

}
