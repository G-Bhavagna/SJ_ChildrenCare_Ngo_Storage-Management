package com.example.SJCC_MockHackathon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "family")
@Data
public class Family {

    @Id
    @GeneratedValue
    private Long id;

    private String family_id;

    private String family_name;



}
