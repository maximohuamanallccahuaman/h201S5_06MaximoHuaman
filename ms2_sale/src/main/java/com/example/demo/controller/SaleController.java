package com.example.demo.controller;

import com.example.demo.model.Sale;
import com.example.demo.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    List<Sale> findAll(){
        return saleService.findAll();
    }

    @PostMapping
    public Sale create(@RequestBody Sale sale){
        return saleService.create(sale);
    }

    @PutMapping
    public Sale update(@RequestBody Sale sale){
        return saleService.update(sale);
    }

    @DeleteMapping
    public void delete(@PathVariable Integer id){
        saleService.delete(id);
    }
}
