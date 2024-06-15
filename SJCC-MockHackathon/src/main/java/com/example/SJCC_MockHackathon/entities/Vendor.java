package com.example.SJCC_MockHackathon.entities;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhone;

    @OneToMany(mappedBy = "vendor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RationInventory> rationInventoryList;



}
