package com.example.SJCC_MockHackathon.controller;

import com.example.SJCC_MockHackathon.entities.Product;
import com.example.SJCC_MockHackathon.entities.RationInventory;
import com.example.SJCC_MockHackathon.entities.VendorLog;
import com.example.SJCC_MockHackathon.repository.VendorLogRepository;
import com.example.SJCC_MockHackathon.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/vendor")
public class VendorController {

    @Autowired
    InventoryService inventoryService;

    @Autowired
    VendorLogRepository vendorLogRepository;

    @PostMapping("/sendProduct/{inv_id}/{vendor_id}")
    public ResponseEntity<VendorLog> sendProduct(@RequestBody Product product, @PathVariable Long inv_id, @PathVariable Long vendor_id) {
        RationInventory rationInventory=inventoryService.getById(inv_id);
        Product temp=new Product();
        for(Product p:rationInventory.getProducts()){
            if(Objects.equals(p.getId(), product.getId())){
                p.setQuantity(p.getQuantity()+product.getQuantity());
                inventoryService.addInventory(rationInventory);
                temp=p;
                break;
            }
        }
        VendorLog vendorLog=new VendorLog(temp,inv_id,vendor_id);
        vendorLogRepository.save(vendorLog);
        return ResponseEntity.ok().body(vendorLog);

    }

}
