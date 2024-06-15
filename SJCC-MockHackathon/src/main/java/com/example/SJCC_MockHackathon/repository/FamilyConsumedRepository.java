package com.example.SJCC_MockHackathon.repository;

import com.example.SJCC_MockHackathon.entities.Family;
import com.example.SJCC_MockHackathon.entities.FamilyConsumed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyConsumedRepository extends JpaRepository<FamilyConsumed, String> {
}
