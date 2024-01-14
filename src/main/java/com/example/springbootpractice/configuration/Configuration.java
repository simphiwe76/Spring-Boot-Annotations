package com.example.springbootpractice.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public RestUrlConfig urlConfig() {
        return new RestUrlConfig();
    }

}
