package com.example.SJCC_MockHackathon.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="vendorlogs")
@NoArgsConstructor
public class VendorLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long vendorId;

    private Long centerId;

    private String product_name;

    private int product_quantity;

    private LocalDate localDate;

    public VendorLog(Product product, Long invId, Long vendorId) {
        this.centerId = invId;
        this.product_name = product.getName();
        this.product_quantity = product.getQuantity();
        this.localDate = LocalDate.now();
        this.vendorId = vendorId;
    }
}
