package com.tobeto.spring.workshop.b.repository.abstracts;

import com.tobeto.spring.workshop.b.Modul.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository {
    String add(Product product);
    List<Product> getall();
    String delete(int id);
    String updateProduct(int id,Product updatedProduct);
}