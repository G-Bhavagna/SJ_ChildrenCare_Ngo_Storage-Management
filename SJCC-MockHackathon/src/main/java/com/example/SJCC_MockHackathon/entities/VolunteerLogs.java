package com.example.SJCC_MockHackathon.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "volunteerlogs")
@Data
@NoArgsConstructor
public class VolunteerLogs {

    @Id
    @GeneratedValue
    private Long id;

    private String volunteerId;

    private Long inventoryId;

    private String familyId;

    private int riceGiven;

    private int daalGiven;

    public VolunteerLogs(FamilyConsumed family, Long invId, String volId,String familyId) {
        this.volunteerId = volId;
        this.inventoryId = invId;
        this.familyId=familyId;
        riceGiven=family.getRiceQuantity();
        daalGiven=family.getDaalQuantity();
    }
}
