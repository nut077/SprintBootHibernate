package com.nutfreedom.service;

import com.nutfreedom.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    Role findByName(String name);
}
