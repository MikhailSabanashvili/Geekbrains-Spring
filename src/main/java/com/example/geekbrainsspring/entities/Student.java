package com.example.geekbrainsspring.entities;

import lombok.Data;

@Data
public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String[] programmingLanguages;
}