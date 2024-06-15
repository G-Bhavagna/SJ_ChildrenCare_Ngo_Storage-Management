package com.example.SJCC_MockHackathon.repository;

import com.example.SJCC_MockHackathon.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
