package com.nutfreedom.service.impl;

import com.nutfreedom.model.Customer;
import com.nutfreedom.repository.CustomerRepository;
import com.nutfreedom.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

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
    public void delete(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }
}
