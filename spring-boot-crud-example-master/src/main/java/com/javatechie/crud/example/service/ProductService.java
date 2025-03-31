package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);  // ✅ Return null if not found
    }

    public Product getProductByName(String name) {
        return repository.findByName(name).orElse(null); // ✅ Use .orElse(null) to handle Optional
    }

    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product removed !! " + id;
    }

    public Product updateProduct(Product product) {
        return repository.save(product);
    }
}
