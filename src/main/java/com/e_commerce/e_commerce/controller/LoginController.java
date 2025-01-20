package com.e_commerce.e_commerce.controller;

import com.e_commerce.e_commerce.dto.LoginResponse;
import com.e_commerce.e_commerce.dto.LogingRequest;
import com.e_commerce.e_commerce.services.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private JwtService jwtService;

    //authentication == logging
    @PostMapping({"/authentication"})
    public LoginResponse createJwtTokenAndlogin(@RequestBody LogingRequest logingRequest) throws Exception{
        System.out.println(logingRequest);
        return jwtService.createJwtToken(logingRequest);
    }


}
