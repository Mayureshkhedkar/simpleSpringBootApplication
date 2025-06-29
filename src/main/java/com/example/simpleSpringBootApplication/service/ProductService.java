package com.example.simpleSpringBootApplication.service;

import com.example.simpleSpringBootApplication.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Products> products=new ArrayList<>(Arrays.asList(
            new Products(101,"camera sony",10000),
            new Products(102,"laptop acer",60000),
            new Products(103,"mouse",350)));

    //simple method returns all the elements in the instance "products"
    //GET method
    public List<Products> getProducts(){
        return products;
    }

    //method which returns a selective product by matching the id
    //GET method
    public Products getProductById(int prodId) {
        for (Products i: products){
            if (i.getProdId()==prodId){
                return i;
            }
        }
        return null;
    }

    //method which can add products to the mutable ArrayList
    //POST method
    public void addProduct(Products prod){
        products.add(prod);
    }

    //method to update the pre existing product in the ArrayList
    //PUT method
    public void updateProduct(Products prod) {
        int index = 0;
        for(int i=0;i<products.size();i++) {
            if (products.get(i).getProdId()== prod.getProdId() )
                index=i;
        }
        products.set(index,prod);
    }

    //method to delete a product from the ArrayList it matches the index given by the client
    //DELETE method
    public void deleteProduct(int prodId) {
        int index=0;

        for (int i=0;i<products.size();i++)
            if (products.get(i).getProdId() == prodId)
                index = i;

        products.remove(index);
    }
}