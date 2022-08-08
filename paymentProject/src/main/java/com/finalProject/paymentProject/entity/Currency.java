package com.finalProject.paymentProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency {

	@Id
	private String currency_code;
	private String currency_name;
	private double conversion_rate;
	
	public Currency() {
		// TODO Auto-generated constructor stub
	}

	public Currency(String currency_code, String currency_name, double conversion_rate) {
		super();
		this.currency_code = currency_code;
		this.currency_name = currency_name;
		this.conversion_rate = conversion_rate;
	}

	public String getCurrency_code() {
		return currency_code;
	}

	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

	public String getCurrency_name() {
		return currency_name;
	}

	public void setCurrency_name(String currency_name) {
		this.currency_name = currency_name;
	}

	public double getConversion_rate() {
		return conversion_rate;
	}

	public void setConversion_rate(double conversion_rate) {
		this.conversion_rate = conversion_rate;
	}

	@Override
	public String toString() {
		return "Currency [currency_code=" + currency_code + ", currency_name=" + currency_name + ", conversion_rate="
				+ conversion_rate + "]";
	}
	
}
