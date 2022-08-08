package com.finalProject.paymentProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Logger {

	@Id
	private String logger_id;
	private String customer_id;
	private String employee_id;
	private String screen_name;
	private String action;
	private String ip_address;
	
	public Logger() {
		// TODO Auto-generated constructor stub
	}

	public Logger(String logger_id, String customer_id, String employee_id, String screen_name, String action,
			String ip_address) {
		super();
		this.logger_id = logger_id;
		this.customer_id = customer_id;
		this.employee_id = employee_id;
		this.screen_name = screen_name;
		this.action = action;
		this.ip_address = ip_address;
	}

	public String getLogger_id() {
		return logger_id;
	}

	public void setLogger_id(String logger_id) {
		this.logger_id = logger_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getScreen_name() {
		return screen_name;
	}

	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	@Override
	public String toString() {
		return "Logger [logger_id=" + logger_id + ", customer_id=" + customer_id + ", employee_id=" + employee_id
				+ ", screen_name=" + screen_name + ", action=" + action + ", ip_address=" + ip_address + "]";
	}
	
}
