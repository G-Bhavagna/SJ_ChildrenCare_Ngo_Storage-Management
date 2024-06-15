package com.example.SJCC_MockHackathon.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "inventory")
@Data
public class RationInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long centerId;

    private String centerName;

    @OneToMany(mappedBy = "rationInventory", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;

}
