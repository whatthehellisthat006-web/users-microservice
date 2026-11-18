package com.koussay.users.service;

import com.koussay.users.entities.Role;
import com.koussay.users.entities.User;
import com.koussay.users.register.RegistationRequest;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername(String username);
    Role findRoleByName(String roleName);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
    User registerUser(RegistationRequest request);
    void sendEmailUser(User u, String code);
    User validateToken(String code);
}

