package com.nutfreedom.service;

import com.nutfreedom.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User save(User user);
    void delete(String username);
    void delete(User user);
    User findByUsername(String username);
}
