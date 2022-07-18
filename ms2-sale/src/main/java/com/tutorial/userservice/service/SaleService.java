package com.tutorial.userservice.service;

import com.tutorial.userservice.entity.Sale;
import com.tutorial.userservice.model.Client;
import com.tutorial.userservice.model.Product;
import com.tutorial.userservice.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    SaleRepository saleRepository;

    @Autowired
    RestTemplate restTemplate;

    public List<Sale> getAll() {
        return saleRepository.findAll();
    }

    public Sale getSaleById(int id) {
        return saleRepository.findById(id).orElse(null);
    }

    public Sale save(Sale sale) {
        Sale saleNew = saleRepository.save(sale);
        return saleNew;
    }

    public List<Product> getProducts(int saleId) {
        List<Product> products = restTemplate.getForObject("http://localhost:8003/product/bysale/" + saleId, List.class);
        return products;
    }

    public List<Client> getClients(int saleId) {
        List<Client> clients = restTemplate.getForObject("http://localhost:8001/client/bysale/" + saleId, List.class);
        return clients;
    }
}
