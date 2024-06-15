package com.example.SJCC_MockHackathon.controller;

import com.example.SJCC_MockHackathon.dto.ProductDto;
import com.example.SJCC_MockHackathon.entities.Product;
import com.example.SJCC_MockHackathon.entities.RationInventory;
import com.example.SJCC_MockHackathon.mapper.ProductMapper;
import com.example.SJCC_MockHackathon.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping("/getInventory/{inv_id}")
    public List<ProductDto> getAllProducts(@PathVariable long inv_id){
        List<ProductDto> products = new ArrayList<>();
        RationInventory rInv = inventoryService.getById(inv_id);
        for(Product p : rInv.getProducts()){
            products.add(ProductMapper.productToProductDto(p));
        }
        return products;


    }
}
