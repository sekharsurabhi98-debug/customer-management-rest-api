package com.tap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tap.SpringBootCrud2Application;
import com.tap.model.Customer;
import com.tap.repository.CustomerRepository;

@Service
public class CustomerService {

    private final SpringBootCrud2Application springBootCrud2Application;

	@Autowired
	private CustomerRepository customerRepository;

    CustomerService(SpringBootCrud2Application springBootCrud2Application) {
        this.springBootCrud2Application = springBootCrud2Application;
    }
	
	public List<Customer> getAllCustomers() {
		
		return (List<Customer>) customerRepository.findAll();
	}

	public Customer getCustomer(int id) {
		
		return customerRepository.findById(id);
	}

	public Customer addCustomer(Customer customer) {
		
		customerRepository.save(customer);
		return customer;
	}

	public String updateCustomer(Customer customer, int id) {
		
		if(customerRepository.findById(id) != null) {
			
			customerRepository.save(customer);
			return "Customer Details Updated Sucessfully";
		}
		return null;
	}

	public String deleteCustomer(int id) {
		
		customerRepository.deleteById(id);
		return "Customer Data Deleted Successfully";
	}

}
