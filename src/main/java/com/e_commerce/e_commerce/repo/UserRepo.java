package com.e_commerce.e_commerce.repo;

import com.e_commerce.e_commerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

}
