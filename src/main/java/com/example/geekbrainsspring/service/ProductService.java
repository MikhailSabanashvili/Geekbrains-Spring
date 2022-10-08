package com.example.geekbrainsspring.service;

import com.example.geekbrainsspring.entities.Product;
import com.example.geekbrainsspring.entities.Products;
import com.example.geekbrainsspring.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public Product findById(Long id) {
        Optional<Product> productOptional = productRepository.findById(id);
        return productOptional.orElseThrow();
    }

    public void saveProducts(Products products) {
        productRepository.saveAll(products.getProducts());
    }


}
