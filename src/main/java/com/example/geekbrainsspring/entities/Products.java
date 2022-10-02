package com.example.geekbrainsspring.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Products {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }
}
