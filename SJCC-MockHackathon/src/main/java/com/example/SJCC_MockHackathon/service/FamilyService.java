package com.example.SJCC_MockHackathon.service;

import com.example.SJCC_MockHackathon.entities.Family;
import com.example.SJCC_MockHackathon.entities.FamilyConsumed;
import com.example.SJCC_MockHackathon.entities.Product;
import com.example.SJCC_MockHackathon.entities.RationInventory;
import com.example.SJCC_MockHackathon.repository.FamilyConsumedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyService {

    @Autowired
    private FamilyConsumedRepository familyRepository;
    @Autowired
    private InventoryService inventoryService;

    public FamilyConsumed save(FamilyConsumed family,long invId) {
        RationInventory rationInventory=inventoryService.getById(invId);
        for(Product product:rationInventory.getProducts()) {
            if(product.getName().equals("rice")) product.setQuantity(product.getQuantity()-family.getRiceQuantity());
            if(product.getName().equals("daal")) product.setQuantity(product.getQuantity()-family.getDaalQuantity());
        }
        inventoryService.addInventory(rationInventory);
        return familyRepository.save(family);
    }
}
