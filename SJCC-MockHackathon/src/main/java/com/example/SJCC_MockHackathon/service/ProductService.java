package com.example.SJCC_MockHackathon.service;

import com.example.SJCC_MockHackathon.entities.Product;
import com.example.SJCC_MockHackathon.entities.RationInventory;
import com.example.SJCC_MockHackathon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private InventoryService inventoryService;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product,Long id) {
        RationInventory rationInventories = inventoryService.getById(id);
        rationInventories.getProducts().add(product);
        product.setRationInventory(rationInventories);
        return productRepository.save(product);
    }
}
