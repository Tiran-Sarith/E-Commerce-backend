package com.e_commerce.e_commerce.controller;

import com.e_commerce.e_commerce.dto.ProductDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/product")
public class ProductController {

    @PostMapping("/add")
    public String saveProduct(@RequestBody ProductDTO productDTO){
        productService.saveproduct(productDTO);
        return "saved";
    }
}
