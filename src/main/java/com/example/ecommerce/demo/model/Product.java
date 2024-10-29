package com.example.ecommerce.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;
    private int productValue;

    public Product() {}

    public Product(String productName, int productValue){
        this.productName = productName;
        this.productValue = productValue;
    }

    public Long getId() {return productId;}
    public void setId(Long productId) {this.productId = productId;}

    public String getName() {return productName;}
    public void setName(String productName) {this.productName = productName;}

    public int getValue() {return productValue;}
    public void setValue(int  productValue) {this.productValue = productValue;}

}
