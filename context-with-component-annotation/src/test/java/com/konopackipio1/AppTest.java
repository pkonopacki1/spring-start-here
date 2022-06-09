package com.konopackipio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class AppTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testKokoIsInTheSpringContext() {
        Car p = context.getBean(Car.class);

        assertEquals("Zaba", p.getName());
    }

}
