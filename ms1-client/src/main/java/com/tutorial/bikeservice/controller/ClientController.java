package com.tutorial.bikeservice.controller;

import com.tutorial.bikeservice.entity.Client;
import com.tutorial.bikeservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> getAll() {
        List<Client> clients = clientService.getAll();
        if(clients.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getById(@PathVariable("id") int id) {
        Client client = clientService.getClientById(id);
        if(client == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(client);
    }

    @PostMapping()
    public ResponseEntity<Client> save(@RequestBody Client client) {
        Client clientNew = clientService.save(client);
        return ResponseEntity.ok(clientNew);
    }

    @GetMapping("/bysale/{saleId}")
    public ResponseEntity<List<Client>> getBysaleId(@PathVariable("saleId") int saleId) {
        List<Client> clients = clientService.bySaleId(saleId);
        if(clients.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(clients);
    }

}
