package com.e_commerce.e_commerce.services;

import com.e_commerce.e_commerce.dto.ProductDTO;
import com.e_commerce.e_commerce.entity.Product;
import com.e_commerce.e_commerce.repo.ProductRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceIMPL implements ProductService{

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public String saveproduct(ProductDTO productDTO) {
        Product product = modelMapper.map(productDTO, Product.class);
        productRepo.save(product);
        return productDTO.getProductName();
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        List<Product> getAllProducts = productRepo.findAll();
        List<ProductDTO> productDTOList = new ArrayList<>();
        for(Product product : getAllProducts){
            ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
            productDTOList.add(productDTO);
        }
        return productDTOList;
    }

    @Override
    public List<ProductDTO> getByCategory(String category) {
        List<Product> getAllProducts = productRepo.findProductsByCategory(category);
        List<ProductDTO> productDTOList = new ArrayList<>();
        for(Product product : getAllProducts){
            ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
            productDTOList.add(productDTO);
        }
        return productDTOList;
    }


}
