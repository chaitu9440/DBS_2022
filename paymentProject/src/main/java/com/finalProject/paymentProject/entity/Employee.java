package com.finalProject.paymentProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private String employee_id;
	private String employee_name;
	private String employee_password;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String employee_id, String employee_name, String employee_password) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_password = employee_password;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_password() {
		return employee_password;
	}

	public void setEmployee_password(String employee_password) {
		this.employee_password = employee_password;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_password="
				+ employee_password + "]";
	}
	
}
