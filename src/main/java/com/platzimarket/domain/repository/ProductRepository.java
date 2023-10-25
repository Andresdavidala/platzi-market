package com.platzimarket.domain.repository;

import com.platzimarket.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product>getAll();
    Optional<List<Product>>getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int producId);
    Product save(Product product);
    void delete(int productId);
}