package com.tutorial.carservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Producto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "price", nullable = false, length = 5)
    private String price;
    @Column(name = "stock", nullable = false, length = 5)
    private String stock;
    @Column(name = "saleId", nullable = false, length = 5)
    private int saleId;
}
