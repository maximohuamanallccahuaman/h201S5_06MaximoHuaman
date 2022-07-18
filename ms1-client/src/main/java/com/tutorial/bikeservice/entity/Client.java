package com.tutorial.bikeservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Cliente")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "lastname", nullable = false, length = 50)
    private String lastname;
    @Column(name = "saleId", nullable = false, length = 5)
    private int saleId;
}
