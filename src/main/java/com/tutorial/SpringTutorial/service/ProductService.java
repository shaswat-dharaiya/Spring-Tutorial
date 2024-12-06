package com.tutorial.SpringTutorial.service;

import com.tutorial.SpringTutorial.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon", 70000),
            new Product(100, "Iphone1", 50000),
            new Product(103, "Samsung", 40000));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().orElse(new Product());
    }
}
