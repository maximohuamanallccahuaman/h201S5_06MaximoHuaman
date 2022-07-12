package com.example.demo.controller;

import com.example.demo.model.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    List<Client> findAll(){
        return clientService.findAll();
    }

    @PostMapping
    public Client create(@RequestBody Client client){
        return clientService.create(client);
    }

    @PutMapping
    public Client update(@RequestBody Client client){
        return clientService.update(client);
    }

    @DeleteMapping
    public void delete(@PathVariable Integer id){
        clientService.delete(id);
    }
}
