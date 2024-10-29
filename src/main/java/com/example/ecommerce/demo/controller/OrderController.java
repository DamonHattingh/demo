package com.example.ecommerce.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import com.example.ecommerce.demo.model.Order;
import com.example.ecommerce.demo.repository.OrderRepository;
import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping
    public List<Order> getAllProducts() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Order getProductById(@PathVariable Long id)
    {
        return orderRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("No order found with id" + id));
    }
}
