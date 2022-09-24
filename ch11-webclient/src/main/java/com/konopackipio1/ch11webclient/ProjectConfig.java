package com.konopackipio1.ch11webclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ProjectConfig {

    // Method returns webclient instance, which is used for calling rest endpoints
    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }
    
}
