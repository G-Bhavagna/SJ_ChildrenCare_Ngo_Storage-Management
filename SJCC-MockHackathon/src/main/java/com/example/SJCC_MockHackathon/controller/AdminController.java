package com.example.SJCC_MockHackathon.controller;

import com.example.SJCC_MockHackathon.entities.Family;
import com.example.SJCC_MockHackathon.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    FamilyRepository familyRepository;

    @PostMapping("/addFamily")
    public ResponseEntity<Family> addFamily(@RequestBody Family family) {
        familyRepository.save(family);
        return ResponseEntity.ok(family);
    }
}
