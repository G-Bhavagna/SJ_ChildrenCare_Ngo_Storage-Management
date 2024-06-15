package com.example.SJCC_MockHackathon.repository;

import com.example.SJCC_MockHackathon.entities.RationInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<RationInventory, Long> {
}
