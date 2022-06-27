package com.geekbrains.spring.web.core.controllers;

import com.geekbrains.spring.web.core.entities.Product;
import com.geekbrains.spring.web.core.services.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor

public class ProductsController {
    private final ProductsService productsService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productsService.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productsService.findById(id).get();
    }

    @PostMapping
    public Product saveNewProduct(@RequestBody Product product) {
        return productsService.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        productsService.deleteById(id);
    }
}
