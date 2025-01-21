package com.e_commerce.e_commerce.services;

import com.e_commerce.e_commerce.entity.Role;
import com.e_commerce.e_commerce.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService  {

    @Autowired
    private RoleRepo roleRepo;

    public Role createNewRole(Role role){
        return roleRepo.save(role);
    }
}
