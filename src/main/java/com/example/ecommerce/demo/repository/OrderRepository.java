package com.example.ecommerce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.demo.model.*;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
