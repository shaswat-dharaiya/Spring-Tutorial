package com.tutorial.SpringTutorial.controller;


import com.tutorial.SpringTutorial.model.Product;
import com.tutorial.SpringTutorial.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;


    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        System.out.println(prodId);
        service.deleteProduct(prodId);
    }
}
