package com.nutfreedom.service.impl;

import com.nutfreedom.model.Customer;
import com.nutfreedom.repository.CustomerRepository;
import com.nutfreedom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findAllByOrderByLastName() {
        return customerRepository.findAllByOrderByLastName();
    }

    @Override
    public List<Customer> findAllByOrderByFirstName() {
        return customerRepository.findAllByOrderByFirstName();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }
}
