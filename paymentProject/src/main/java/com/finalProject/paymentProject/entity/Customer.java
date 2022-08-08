package com.finalProject.paymentProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private String customer_id;
	private String account_holder_name;
	private boolean over_draft_flag;
	private double clear_balance;
	private String customer_address;
	private String customer_city;
	private char customer_type;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customer_id, String account_holder_name, boolean over_draft_flag, double clear_balance,
			String customer_address, String customer_city, char customer_type) {
		super();
		this.customer_id = customer_id;
		this.account_holder_name = account_holder_name;
		this.over_draft_flag = over_draft_flag;
		this.clear_balance = clear_balance;
		this.customer_address = customer_address;
		this.customer_city = customer_city;
		this.customer_type = customer_type;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getAccount_holder_name() {
		return account_holder_name;
	}

	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}

	public boolean isOver_draft_flag() {
		return over_draft_flag;
	}

	public void setOver_draft_flag(boolean over_draft_flag) {
		this.over_draft_flag = over_draft_flag;
	}

	public double getClear_balance() {
		return clear_balance;
	}

	public void setClear_balance(double clear_balance) {
		this.clear_balance = clear_balance;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public String getCustomer_city() {
		return customer_city;
	}

	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}

	public char getCustomer_type() {
		return customer_type;
	}

	public void setCustomer_type(char customer_type) {
		this.customer_type = customer_type;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", account_holder_name=" + account_holder_name
				+ ", over_draft_flag=" + over_draft_flag + ", clear_balance=" + clear_balance + ", customer_address="
				+ customer_address + ", customer_city=" + customer_city + ", customer_type=" + customer_type + "]";
	}
	
}
