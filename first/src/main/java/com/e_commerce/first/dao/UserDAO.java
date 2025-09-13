package com.e_commerce.first.dao;

import com.e_commerce.first.entity.Role;
import com.e_commerce.first.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, String> {

}
