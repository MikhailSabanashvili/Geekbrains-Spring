package com.example.geekbrainsspring.controllers;

import com.example.geekbrainsspring.entities.Product;
import com.example.geekbrainsspring.entities.Products;
import com.example.geekbrainsspring.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/addProducts")
    public String getEmptyProductsTable(Model uiModel) {
        Products products = new Products();
        for (int i = 0; i < 10; i++) {
            products.addProduct(new Product());
        }
        uiModel.addAttribute("products", products);
        return "add_products";
    }

    @GetMapping("/saveProducts")
    public void saveProducts(@ModelAttribute("products") Products products) {
        productService.saveProducts(products);
    }
    @GetMapping("/getAllProducts")
    public String getProducts(Model uiModel) {
        List<Product> all = productService.findAll();
        Products products = new Products();
        products.setProducts(all);
        uiModel.addAttribute("products", products);
        return "get_products";
    }
}
