package com.nutfreedom.service.impl;

import com.nutfreedom.model.Customer;
import com.nutfreedom.repository.CustomerRepository;
import com.nutfreedom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
