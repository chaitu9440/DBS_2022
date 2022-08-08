package com.finalProject.paymentProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalProject.paymentProject.entity.Customer;
import com.finalProject.paymentProject.services.CustomerServices;

@CrossOrigin(origins = "*")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServices customerservices;
	
	@GetMapping("/getcustomers")
	public ResponseEntity<List<Customer>> getCustomers() {
		return ResponseEntity.ok(customerservices.getallcustomers());
	}
}
