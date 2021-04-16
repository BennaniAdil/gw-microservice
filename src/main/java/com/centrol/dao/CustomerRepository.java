package com.centrol.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.centrol.model.Customer;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
