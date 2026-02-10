package com.tap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tap.model.Customer;
import com.tap.repository.CustomerRepository;
import com.tap.service.CustomerService;


@RestController
public class CustomerController {

    private final CustomerRepository customerRepository;

	
	@Autowired
	private CustomerService customerService;


    CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

 
	
	@GetMapping("customer")
	public List<Customer> getAllCustomer(){
		
		return customerService.getAllCustomers();
	}
	
	@GetMapping("customer/{id}")
	public Customer getCustomer(@PathVariable("id") int id) {
		return customerService.getCustomer(id);
	}
	
	@PostMapping("customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@PutMapping("customer/{id}")
	public String updateCustomer(@RequestBody Customer customer, @PathVariable("id") int id) {
		return customerService.updateCustomer(customer,id);
	}
	
	@DeleteMapping("customer/{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		return customerService.deleteCustomer(id);
	}

}
