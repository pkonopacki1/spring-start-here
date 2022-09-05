package com.konopackipio1.sqch8ex5.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.konopackipio1.sqch8ex5.model.Product;

@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> findAll() {
        return productList;
    }
}
