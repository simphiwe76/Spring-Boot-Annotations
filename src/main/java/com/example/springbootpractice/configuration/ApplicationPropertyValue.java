package com.example.springbootpractice.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Data
@ConfigurationProperties(prefix = "app")
public class ApplicationPropertyValue {
    private String name;
    private String message;
    private List<String> colors;
}
