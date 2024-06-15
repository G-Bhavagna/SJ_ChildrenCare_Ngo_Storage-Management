package com.example.SJCC_MockHackathon.controller;

import com.example.SJCC_MockHackathon.entities.Product;
import com.example.SJCC_MockHackathon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct/{inv_id}")
    public ResponseEntity<Product> addProduct(@RequestBody Product product, @PathVariable Long inv_id) {
        return ResponseEntity.ok(productService.addProduct(product,inv_id));
    }

    @GetMapping("/allProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
