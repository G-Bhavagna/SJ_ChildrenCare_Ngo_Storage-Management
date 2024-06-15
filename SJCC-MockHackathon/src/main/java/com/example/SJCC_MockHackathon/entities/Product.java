package com.example.SJCC_MockHackathon.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int quantity;

    private int productSize;

    @ManyToOne
    @JoinColumn(name = "inventory_id", nullable = false)
    private RationInventory rationInventory;

}
