package com.example.login.repository;

import com.example.login.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDAO extends CrudRepository<Role, Integer> {
}
