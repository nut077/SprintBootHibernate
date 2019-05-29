package com.nutfreedom.service.impl;

import com.nutfreedom.model.Role;
import com.nutfreedom.repository.RoleRepository;
import com.nutfreedom.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository repository;

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }

    @Override
    public Role findByName(String name) {
        Optional<Role> role = repository.findById(name);
        return role.orElse(null);
    }
}
