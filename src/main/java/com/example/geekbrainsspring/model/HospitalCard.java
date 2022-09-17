package com.example.geekbrainsspring.model;

import lombok.Data;

@Data
public class HospitalCard {
    private final Pacient pacient;
    private final Hospital hospital;
    private final String medicalHistory;
}
