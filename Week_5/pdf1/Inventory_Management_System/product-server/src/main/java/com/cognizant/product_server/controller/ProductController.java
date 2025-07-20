package com.cognizant.product_server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Value("${my.product.message}")
    private String message;

    @GetMapping("/hello")
    public String helloProduct() {
        return message;
    }

    @GetMapping("/details")
    public String getProductDetails() {
        return "Product details: Laptop, Price: 60000";
    }
}

