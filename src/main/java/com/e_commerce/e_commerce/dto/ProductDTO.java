package com.e_commerce.e_commerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDTO {

    private int productId;
    private String productName;
    private int price;
    private String color;
    private String category;
    private String description;
}
