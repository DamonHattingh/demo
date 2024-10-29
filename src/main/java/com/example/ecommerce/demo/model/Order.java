package com.example.ecommerce.demo.model;

import jakarta.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Product product;

    public Order() {}

    public Order(Product product){
        this.product = product;
    }

    public Long getId(){return id;}
    public void setId(long id){this.id = id;}

    public Product getProduct() {return product;}
    public void setProduct(Product product) {this.product = product;}

}
