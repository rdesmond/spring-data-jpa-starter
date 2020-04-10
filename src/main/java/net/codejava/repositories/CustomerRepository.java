package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByFirstnameAndLastname(String firstname, String lastname);
}
