package com.example.SJCC_MockHackathon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class FamilyConsumed{

    @Id
    @GeneratedValue
    private Long id;

    private String family_id;

    private int riceQuantity;

    private int daalQuantity;

//    private int washingPowder;
}
