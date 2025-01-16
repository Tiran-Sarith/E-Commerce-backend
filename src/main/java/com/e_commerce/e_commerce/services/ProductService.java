package com.e_commerce.e_commerce.services;

import com.e_commerce.e_commerce.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    String saveproduct(ProductDTO productDTO);

    List<ProductDTO> getAllProducts();


    List<ProductDTO> getByCategory(String category);
}
