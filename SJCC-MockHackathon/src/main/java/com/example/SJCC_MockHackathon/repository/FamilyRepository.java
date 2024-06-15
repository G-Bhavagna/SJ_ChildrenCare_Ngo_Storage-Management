package com.example.SJCC_MockHackathon.repository;

import com.example.SJCC_MockHackathon.entities.Family;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepository extends JpaRepository<Family,String> {
}
