package com.example.demo.service;

import com.example.demo.model.Client;

import java.util.List;

public interface ClientService {

    List<Client> findAll();

    Client create(Client client);

    Client update(Client client);

    void delete(Integer id);
}
