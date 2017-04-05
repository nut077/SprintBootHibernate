package com.nutfreedom.service.impl;

import com.nutfreedom.model.Role;
import com.nutfreedom.repository.RoleRepository;
import com.nutfreedom.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository repository;

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }

    @Override
    public Role findByName(String name) {
        return repository.findOne(name);
    }
}
