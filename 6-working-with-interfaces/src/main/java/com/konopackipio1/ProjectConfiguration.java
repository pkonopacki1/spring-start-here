package com.konopackipio1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.konopackipio1.proxies",
        "com.konopackipio1.repositories",
        "com.konopackipio1.services"
})
public class ProjectConfiguration {

}
