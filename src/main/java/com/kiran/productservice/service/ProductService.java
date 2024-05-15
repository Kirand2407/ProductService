package com.kiran.productservice.service;

import com.kiran.productservice.model.products;

import java.util.List;

public interface ProductService {
      products getSingleProduct(long id);
      List<products> getAllProducts();
      products createProduct(products product);
}
