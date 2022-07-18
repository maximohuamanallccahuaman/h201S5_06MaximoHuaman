package com.tutorial.bikeservice.service;

import com.tutorial.bikeservice.entity.Client;
import com.tutorial.bikeservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client getClientById(int id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client save(Client client) {
        Client clientNew = clientRepository.save(client);
        return clientNew;
    }

    public List<Client> bySaleId(int saleId) {
        return clientRepository.findBySaleId(saleId);
    }
}
