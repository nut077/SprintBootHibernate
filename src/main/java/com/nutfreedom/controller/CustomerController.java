package com.nutfreedom.controller;

import com.nutfreedom.model.Customer;
import com.nutfreedom.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomer(Model model) {
        model.addAttribute("customers", customerService.findAllByOrderByFirstName());
        return "list-customers";
    }

    @GetMapping("/form-add")
    public String formCustomer(Customer customer) {
        return "form-customer";
    }

    @PostMapping("/save")
    public String saveCustomer(@Valid Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
             return "form-customer";
        } else {
            customerService.save(customer);
        }
        return "redirect:/customer/list";
    }

    @GetMapping("/form-update/{id}")
    public String updateCustomer(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "form-customer";
    }

}
