package com.nutfreedom.repository;

import com.nutfreedom.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findAllByOrderByLastName();
    List<Customer> findAllByOrderByFirstName();
    Customer findById(int id);
}
