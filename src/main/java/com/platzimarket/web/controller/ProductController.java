package com.platzimarket.web.controller;


import com.platzimarket.domain.Product;
import com.platzimarket.domain.service.ProductSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    //Autowired se puede utilizar siempre y cuando el objeto tenga una anotación de spring para así poder aplicar la inyeccion de dependencias
    @Autowired
    private ProductSerivce productSerivce;


    @GetMapping("/all")
    public List<Product> getAll(){
        return productSerivce.getAll();
    }

    public Optional<Product> getProduct(int productId){
        return productSerivce.getProduct(productId);

    }

    public Optional<List<Product>> getByCategory(int categoryId){
        return productSerivce.getByCategory(categoryId);
    }

    public Product save (Product product){
        return productSerivce.save(product);
    }

    public boolean delete(int productId){
        return productSerivce.delete(productId);
    }
}
