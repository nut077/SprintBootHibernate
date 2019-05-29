package com.nutfreedom.repository;

import com.nutfreedom.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findAllByOrderByLastName();
    List<Customer> findAllByOrderByFirstName();
    Customer findById(int id);
}
