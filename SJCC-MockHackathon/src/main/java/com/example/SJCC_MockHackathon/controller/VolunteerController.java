package com.example.SJCC_MockHackathon.controller;

import com.example.SJCC_MockHackathon.entities.Family;
import com.example.SJCC_MockHackathon.entities.FamilyConsumed;
import com.example.SJCC_MockHackathon.entities.Volunteer;
import com.example.SJCC_MockHackathon.entities.VolunteerLogs;
import com.example.SJCC_MockHackathon.repository.VolunteerRepository;
import com.example.SJCC_MockHackathon.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/volunteer")
public class VolunteerController {


    @Autowired
    private FamilyService familyService;
    @Autowired
    private VolunteerRepository volunteerRepository;

    @PostMapping("/assignRation/{inv_id}/{fam_id}/{vol_id}")
    public ResponseEntity<VolunteerLogs> assignRation(@RequestBody FamilyConsumed family, @PathVariable Long inv_id,@PathVariable String fam_id ,@PathVariable String vol_id) {

        VolunteerLogs volunteer = new VolunteerLogs(family, inv_id,vol_id,fam_id);
        family.setFamily_id(fam_id);
        volunteerRepository.save(volunteer);
        familyService.save(family,inv_id);
        return ResponseEntity.ok(volunteer);
    }
}
