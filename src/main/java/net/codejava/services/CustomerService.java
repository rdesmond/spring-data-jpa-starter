package net.codejava.services;

import net.codejava.repositories.Customer;
import net.codejava.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repo;

    public List<Customer> getAllCustomers() {
        return repo.findAll();
    }

    public Customer createCustomer(Customer customer) {

        repo.save(customer);
        return repo.findByFirstnameAndLastname(customer.getFirstname(), customer.getLastname());
    }
}
