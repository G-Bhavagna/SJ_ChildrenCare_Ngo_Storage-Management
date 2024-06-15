package com.example.SJCC_MockHackathon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "volunteer")
@Data
public class Volunteer {

    @Id
    private String v_id;

    private String name;

    private String phone;

    private String email;

    private String password;

    private Long center_id;
}
