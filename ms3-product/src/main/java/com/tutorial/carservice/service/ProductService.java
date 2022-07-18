package com.tutorial.carservice.service;

import com.tutorial.carservice.entity.Product;
import com.tutorial.carservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product save(Product product) {
        Product productNew = productRepository.save(product);
        return productNew;
    }

    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    public List<Product> bySaleId(int saleId) {
        return productRepository.findBySaleId(saleId);
    }
}
