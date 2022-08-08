package com.finalProject.paymentProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalProject.paymentProject.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, String>{

}
