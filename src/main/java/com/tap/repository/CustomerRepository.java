package com.tap.repository;

import org.springframework.data.repository.CrudRepository;

import com.tap.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	Customer findById(int id);
}
