package com.example.SJCC_MockHackathon.service;

import com.example.SJCC_MockHackathon.entities.VolunteerLogs;
import com.example.SJCC_MockHackathon.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VolunteerService {

    @Autowired
    VolunteerRepository volunteerRepository;

    public VolunteerLogs saveVolunteerLogs(VolunteerLogs volunteerLogs) {
        return volunteerRepository.save(volunteerLogs);
    }
}
