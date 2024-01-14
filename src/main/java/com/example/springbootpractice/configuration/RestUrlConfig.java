package com.example.springbootpractice.configuration;

import org.springframework.beans.factory.annotation.Value;

public class RestUrlConfig {
    @Value("${app.contries.url}")
    private String countriesUrl;

    public String getCountriesUrl() {
        return countriesUrl;
    }
}
