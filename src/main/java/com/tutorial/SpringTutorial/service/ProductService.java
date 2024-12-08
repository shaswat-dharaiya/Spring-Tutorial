package com.tutorial.SpringTutorial.service;

import com.tutorial.SpringTutorial.model.Product;
import com.tutorial.SpringTutorial.reporsitory.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "Iphone", 50000),
//            new Product(102, "Canon", 70000),
//            new Product(100, "Iphone1", 50000),
//            new Product(103, "Samsung", 40000)));

    public List<Product> getProducts(){
//        return products;
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst().orElse(new Product());
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        products.set(getIndex(prod.getProdId()), prod);
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
//        products.remove(getIndex(prodId));
        repo.deleteById(prodId);
    }


//    public int getIndex(int prodId){
//        int index = -1;
//        for(int i = 0; i < products.size(); i++)
//            if(products.get(i).getProdId() == prodId)
//                index = i;
//        return index;
//    }
}
