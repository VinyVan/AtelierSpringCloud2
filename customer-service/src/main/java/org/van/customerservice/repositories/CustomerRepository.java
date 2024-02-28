package org.van.customerservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.van.customerservice.entities.Customer;

@RestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
