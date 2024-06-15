package com.example.SJCC_MockHackathon.mapper;

import com.example.SJCC_MockHackathon.dto.ProductDto;
import com.example.SJCC_MockHackathon.entities.Product;

public class ProductMapper {

    public static ProductDto productToProductDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setQuantity(product.getQuantity());
        productDto.setProductSize(product.getProductSize());
        return productDto;
    }
}
