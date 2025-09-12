package com.e_commerce.first.service;

import com.e_commerce.first.dao.GestionDAO;
import com.e_commerce.first.dao.GestionDAOImpl;
import com.e_commerce.first.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionService {

    @Autowired
    private GestionDAO gestionDAO;
    public Role createNewRole(Role role) {
        return gestionDAO.save(role);
    }

    public void initRolesAndUser(){
        Role admin = new Role();
        admin.setRoleDescription("Role Admin");
        admin.setRoleName("Admin");
        Role user = new Role();
        admin.setRoleDescription("Role user");
        admin.setRoleName("User");
    }
}
