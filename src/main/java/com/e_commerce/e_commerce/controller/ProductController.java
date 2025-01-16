package com.e_commerce.e_commerce.controller;

import com.e_commerce.e_commerce.dto.ProductDTO;
import com.e_commerce.e_commerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public String saveProduct(@RequestBody ProductDTO productDTO){
        productService.saveproduct(productDTO);
        return "saved";
    }

    @GetMapping("/get-all")
    public List<ProductDTO> getAllProduct(){
       List<ProductDTO> allProduct = productService.getAllProducts();
        return allProduct;
    }

    @GetMapping(path = "/get-all-by-category/{category}")
    public List<ProductDTO> getByCategory(@PathVariable(value= "category") String category){
        List<ProductDTO> productByAccessory = productService.getByCategory(category);
        return productByAccessory;
    }


}
