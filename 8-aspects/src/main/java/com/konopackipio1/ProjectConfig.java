package com.konopackipio1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({ "com.konopackipio1.services", "com.konopackipio1.aspects" })
@EnableAspectJAutoProxy
public class ProjectConfig {

}
