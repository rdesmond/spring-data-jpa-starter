package net.codejava.controllers;

import net.codejava.repositories.Customer;
import net.codejava.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping()
    public List<Customer> getAllCustomers(){
        return service.getAllCustomers();
    }

    @PostMapping()
    public Customer createCustomer(@RequestBody Customer customer) {
        return service.createCustomer(customer);
    }

}
