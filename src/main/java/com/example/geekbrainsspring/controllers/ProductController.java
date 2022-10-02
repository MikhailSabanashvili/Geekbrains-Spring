package com.example.geekbrainsspring.controllers;

import com.example.geekbrainsspring.entities.Product;
import com.example.geekbrainsspring.entities.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ProductController {
    @GetMapping("/addProducts")
    public String getEmptyProductsTable(Model uiModel) {
        Products products = new Products();
        for (int i = 0; i < 10; i++) {
            products.addProduct(new Product());
        }
        uiModel.addAttribute("products", products);
        return "add_products";
    }

    @GetMapping("/getProducts")
    public String getProducts(@ModelAttribute("products") Products products) {
        return "get_products";
    }
}
