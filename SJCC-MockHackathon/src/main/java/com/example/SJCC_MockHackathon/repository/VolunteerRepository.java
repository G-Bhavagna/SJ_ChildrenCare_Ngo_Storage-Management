package com.example.SJCC_MockHackathon.repository;

import com.example.SJCC_MockHackathon.entities.VolunteerLogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolunteerRepository extends JpaRepository<VolunteerLogs, Long> {
}
