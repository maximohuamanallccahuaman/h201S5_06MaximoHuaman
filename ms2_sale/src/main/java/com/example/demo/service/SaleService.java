package com.example.demo.service;

import com.example.demo.model.Sale;

import java.util.List;

public interface SaleService {

    List<Sale> findAll();

    Sale create(Sale sale);

    Sale update(Sale sale);

    void delete(Integer id);


}
