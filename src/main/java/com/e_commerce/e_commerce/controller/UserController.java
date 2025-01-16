package com.e_commerce.e_commerce.controller;


import com.e_commerce.e_commerce.entity.User;
import com.e_commerce.e_commerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping({"register-new-user"})
    public User registerNewuser(@RequestBody User user){
        return userService.registerNewUser(user);
    }

    @PostConstruct
    public void initRoleAndUser(){
        userService.initRoleAndUser();
    }

    @GetMapping({"for-admin"})
    public String forAdmin(){
        return "This url is only accessible to admin";
    }

    @GetMapping({"for-user"})
    public String forUser(){
        return "This url is only accessible to user";
    }
}
