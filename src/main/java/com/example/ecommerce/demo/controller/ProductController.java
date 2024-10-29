package com.example.ecommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ecommerce.demo.model.*;
import com.example.ecommerce.demo.repository.*;
import java.util.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id)
    {
        return productRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("No product found with id" + id));
    }
}
