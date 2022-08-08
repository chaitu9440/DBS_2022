package com.finalProject.paymentProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalProject.paymentProject.entity.Customer;
import com.finalProject.paymentProject.repository.CustomerRepository;

@Service
public class CustomerServices {
	
	@Autowired
	private CustomerRepository customerrepository;
	
	public List<Customer> getAllCustomers(){
		return (List<Customer>) customerrepository.findAll();
	}
	public Customer getCustomerById() {
		return (Customer) customerrepository.getById(null)
	}
}
