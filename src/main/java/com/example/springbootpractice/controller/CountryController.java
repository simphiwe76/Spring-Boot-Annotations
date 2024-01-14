package com.example.springbootpractice.controller;

import com.example.springbootpractice.configuration.ApplicationPropertyValue;
import com.example.springbootpractice.dto.CountryDTO;
import com.example.springbootpractice.service.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;
    @Autowired
    private ApplicationPropertyValue applicationPropertyValue;

    @GetMapping("/")
    public String message() {
        return countryService.message(applicationPropertyValue.getMessage() + " : Name : " + applicationPropertyValue.getName());
    }

    @GetMapping("/countries/{year}/{countryCode}")
    public List<CountryDTO> getCountries(@PathVariable int year, @PathVariable String countryCode) {
        log.info("Colors read as List: {}", applicationPropertyValue.getColors());
        return countryService.getCountries(year, countryCode);
    }
}
