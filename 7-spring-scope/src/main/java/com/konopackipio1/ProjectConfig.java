package com.konopackipio1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.konopackipio1.services", "com.konopackipio1.repositories" })
public class ProjectConfig {

}
