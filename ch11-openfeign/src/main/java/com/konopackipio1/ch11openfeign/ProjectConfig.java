package com.konopackipio1.ch11openfeign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.konopackipio1.ch11openfeign.proxy")
public class ProjectConfig {
}
