package com.example.login;

import com.example.login.model.Role;
import com.example.login.model.User;
import com.example.login.repository.RoleDAO;
import com.example.login.repository.UserDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserDaoTest {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RoleDAO roleDAO;

    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    };

    @Test
    public void add() {
        User user = new User();
        user.setEmail("dongvo2@gmail.com");
        user.setFirstName("dong");
        user.setLastName("vo");
        user.setEnabled(false);

        Role role = roleDAO.findById(1).get();
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        user.setRoles(roles);

        user.setPassword(passwordEncoder().encode("123123"));

        userDAO.save(user);
    }

}
