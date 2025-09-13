package com.e_commerce.first.controller;

import com.e_commerce.first.entity.Role;
import com.e_commerce.first.service.GestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gestion")
public class GestionController {

    @Autowired
    private GestionService gestionService;
    //registerNewUser
    @PostMapping({"/createNewModel"})
    public Role createNewRole(@RequestBody Role role) {
        return gestionService.createNewRole(role);
    }

    //foradmin
    @GetMapping({"/admin"})
    public String forAdmin(@RequestBody Role role) {
        return "This url is only accessible to admin";
    }

    //forUser
    @GetMapping({"/user"})
    public String forUser(@RequestBody Role role) {
        return "This url is only accessible to user";
    }

}