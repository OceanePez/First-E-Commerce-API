package com.e_commerce.first.dao;

import com.e_commerce.first.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GestionDAO extends CrudRepository<Role, String> {

}
