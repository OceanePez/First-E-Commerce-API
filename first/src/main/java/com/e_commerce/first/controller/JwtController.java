package com.e_commerce.first.controller;


import com.e_commerce.first.entity.JwtRequest;
import com.e_commerce.first.entity.JwtResponse;
import com.e_commerce.first.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping({"/authentificate"})
    public JwtResponse authentificate(@RequestBody JwtRequest jwtRequest){
        return jwtService.createJwtToken(jwtRequest);
    }
}
