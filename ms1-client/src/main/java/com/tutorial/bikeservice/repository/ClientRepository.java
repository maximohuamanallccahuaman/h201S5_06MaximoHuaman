package com.tutorial.bikeservice.repository;

import com.tutorial.bikeservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    List<Client> findBySaleId(int saleId);
}
