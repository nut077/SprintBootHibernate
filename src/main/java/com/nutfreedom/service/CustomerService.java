package com.nutfreedom.service;

import com.nutfreedom.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    List<Customer> findAllByOrderByLastName();
    List<Customer> findAllByOrderByFirstName();
    void save(Customer customer);
    Customer findById(int id);
}
