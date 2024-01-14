package com.example.springbootpractice.service;

import com.example.springbootpractice.dto.CountryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {
    public String message(String message);
    public List<CountryDTO> getCountries(int year, String countryCode);
}
