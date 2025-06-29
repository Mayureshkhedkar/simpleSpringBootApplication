package com.example.simpleSpringBootApplication.controller;

import com.example.simpleSpringBootApplication.model.Products;
import com.example.simpleSpringBootApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Products> getProduct(){
        return service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Products getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Products prod){
        System.out.println("data coming on the server= "+prod);
        service.addProduct(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Products prod){
        System.out.println("data coming to get updated= "+prod);
        service.updateProduct(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        System.out.println("The product id given by the user to be deleted= "+prodId);
        service.deleteProduct(prodId);
    }
}
