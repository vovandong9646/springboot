package com.example.login.repository;

import com.example.login.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Integer> {
    public User findByEmail(String email);
}
