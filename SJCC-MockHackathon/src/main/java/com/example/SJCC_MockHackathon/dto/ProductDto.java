package com.example.SJCC_MockHackathon.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;

    private String name;

    private int quantity;

    private int productSize;
}
