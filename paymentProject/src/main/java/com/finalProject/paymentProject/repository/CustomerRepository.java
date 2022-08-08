package com.finalProject.paymentProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalProject.paymentProject.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

}
