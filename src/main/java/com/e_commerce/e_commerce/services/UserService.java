package com.e_commerce.e_commerce.services;

import com.e_commerce.e_commerce.entity.Role;
import com.e_commerce.e_commerce.entity.User;
import com.e_commerce.e_commerce.repo.RoleRepo;
import com.e_commerce.e_commerce.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

//    @Autowired
//    private PasswordEncoder passwordEncoder;


    public User registerNewUser(User user) {
        return userRepo.save(user);
    }

    public void initRoleAndUser() {
        Role adminRole = new Role();
        Role userRole = new Role();
        if (!roleRepo.existsById("Admin")) {
            adminRole.setRolename("Admin");
            adminRole.setRoleDescription("Admin Role");
            roleRepo.save(adminRole);
        }

        if (!roleRepo.existsById("User")) {
            userRole.setRolename("User");
            userRole.setRoleDescription("User Role");
            roleRepo.save(userRole);
        }

        if (!userRepo.existsById("admin123")) {
            User user = new User();
            user.setUserName("admin123");
            user.setUserPassword("admin@123");
            user.setUserFirstName("Tiran");
            user.setUserLastName("Wijerathne");

            Set<Role> adminRoles = new HashSet<>();
            adminRoles.add(adminRole);

            user.setRole(adminRoles);
            userRepo.save(user);
        }

        if (!userRepo.existsById("user123")) {
            User user = new User();
            user.setUserName("user123");
            user.setUserPassword("user@123");
            user.setUserFirstName("Shalini");
            user.setUserLastName("Perera");

            Set<Role> userRoles = new HashSet<>();
            userRoles.add(userRole);

            user.setRole(userRoles);
            userRepo.save(user);
        }
    }

//    public String getEncodedPassword(String password) {
//        return passwordEncoder.encode(password);
//    }
}

