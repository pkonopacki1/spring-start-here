package com.konopackipio1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Informing spring that this is a config class
@Configuration
// We tell configuration where to look for components annotated with @Component
@ComponentScan(basePackages = "com.konopackipio1")
public class SpringConfig {

}
