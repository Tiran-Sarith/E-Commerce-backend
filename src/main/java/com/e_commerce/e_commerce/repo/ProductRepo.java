package com.e_commerce.e_commerce.repo;

import com.e_commerce.e_commerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
