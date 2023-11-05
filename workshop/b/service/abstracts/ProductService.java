package com.tobeto.spring.workshop.b.service.abstracts;

import com.tobeto.spring.workshop.b.Modul.Product;

import java.util.List;

public interface ProductService {

        List<Product> getall();
        String add(Product product);
        String delete(int id);
        String updateProduct(int id, Product updatedProduct);
    }

