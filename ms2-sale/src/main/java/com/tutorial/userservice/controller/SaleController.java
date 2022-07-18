package com.tutorial.userservice.controller;

import com.tutorial.userservice.entity.Sale;
import com.tutorial.userservice.model.Client;
import com.tutorial.userservice.model.Product;
import com.tutorial.userservice.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    SaleService saleService;

    @GetMapping
    public ResponseEntity<List<Sale>> getAll() {
        List<Sale> sales = saleService.getAll();
        if(sales.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(sales);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sale> getById(@PathVariable("id") int id) {
        Sale sale = saleService.getSaleById(id);
        if(sale == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(sale);
    }

    @PostMapping()
    public ResponseEntity<Sale> save(@RequestBody Sale sale) {
        Sale saleNew = saleService.save(sale);
        return ResponseEntity.ok(saleNew);
    }

    @GetMapping("/products/{saleId}")
    public ResponseEntity<List<Product>> getProducts(@PathVariable("saleId") int saleId) {
        Sale sale = saleService.getSaleById(saleId);
        if(sale == null)
            return ResponseEntity.notFound().build();
        List<Product> products = saleService.getProducts(saleId);
        return ResponseEntity.ok(products);
    }

    @GetMapping("/clients/{saleId}")
    public ResponseEntity<List<Client>> getClients(@PathVariable("saleId") int saleId) {
        Sale sale = saleService.getSaleById(saleId);
        if(sale == null)
            return ResponseEntity.notFound().build();
        List<Client> clients = saleService.getClients(saleId);
        return ResponseEntity.ok(clients);
    }

}
