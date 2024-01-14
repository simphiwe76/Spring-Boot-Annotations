package com.example.springbootpractice.service;

import com.example.springbootpractice.configuration.RestUrlConfig;
import com.example.springbootpractice.dto.CountryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CountryService1 implements CountryService {

    @Autowired
    private RestUrlConfig restUrlConfig;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String message(String message) {
        return message;
    }

    @Override
    public List<CountryDTO> getCountries(int year, String countryCode) {

       final var contriesDTO = restTemplate.exchange(
                restUrlConfig.getCountriesUrl() + year + "/" + countryCode,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CountryDTO>>() {});

        return contriesDTO.getBody();
    }
}
