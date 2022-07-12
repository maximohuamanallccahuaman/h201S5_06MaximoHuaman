package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "Venta")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "date", nullable = false, length = 50)
    private String date;
    @Column(name = "clientId", nullable = false, length = 50)
    private Integer clientId;
    @Column(name = "productId", nullable = false, length = 50)
    private Integer productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
