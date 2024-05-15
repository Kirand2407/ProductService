package com.kiran.productservice.service;

import com.kiran.productservice.model.products;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FakeStoreApi implements ProductService  {

    @Override
    public products getSingleProduct(long id) {
        return null;
    }

    @Override
    public List<products> getAllProducts() {
        return List.of();
    }

    @Override
    public products createProduct(products product) {
        return null;
    }
}
