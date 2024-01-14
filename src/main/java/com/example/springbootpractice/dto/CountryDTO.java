package com.example.springbootpractice.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CountryDTO implements Serializable {
    private String date;
    private String localName;
    private String countryCode;
    private List<String> types;
}
