package com.example.geekbrainsspring.model;

import lombok.Data;

@Data
public class Hospital {
    private final String area;
    private final String district;
    private final String city;
    private final String street;
    private final Integer houseNumber;
}
