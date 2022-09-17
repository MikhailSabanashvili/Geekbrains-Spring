package com.example.geekbrainsspring.model;

import lombok.Data;

@Data
public class Pacient {
    private final String name;
    private final String surname;
    private final String patronymic;
    private final String birthDate;
}
