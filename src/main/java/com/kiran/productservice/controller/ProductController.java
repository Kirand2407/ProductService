package com.kiran.productservice.controller;


import com.kiran.productservice.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



 @RestController
public class ProductController {

     private ProductService productservice;

    @PostMapping("/products")
    public void createProduct(){

    }
    @GetMapping("/products/{id}")
    public void getProduct(@PathVariable("id") long id){

    }
    @GetMapping("/products")
    public void getAllProduct(){
        
    }
}
