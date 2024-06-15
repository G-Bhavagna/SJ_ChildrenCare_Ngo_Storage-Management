package com.example.SJCC_MockHackathon.service;

import com.example.SJCC_MockHackathon.entities.Product;
import com.example.SJCC_MockHackathon.entities.RationInventory;
import com.example.SJCC_MockHackathon.repository.InventoryRepository;
import com.example.SJCC_MockHackathon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;
    @Autowired
    private ProductRepository productRepository;

    public ResponseEntity<RationInventory> addInventory(RationInventory inventory) {
        RationInventory savedInventory = inventoryRepository.save(inventory);
        List<Product> products = productRepository.findAll();
        return ResponseEntity.ok(savedInventory);
    }

    public List<RationInventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public RationInventory getById(Long id) {
        return inventoryRepository.findById(id).orElse(null);
    }
}
