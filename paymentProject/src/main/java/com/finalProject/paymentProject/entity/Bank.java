package com.finalProject.paymentProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	
	@Id
	private String bank_bic;
	private String bank_name;
	
	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(String bank_bic, String bank_name) {
		super();
		this.bank_bic = bank_bic;
		this.bank_name = bank_name;
	}

	public String getBank_bic() {
		return bank_bic;
	}

	public void setBank_bic(String bank_bic) {
		this.bank_bic = bank_bic;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	@Override
	public String toString() {
		return "Bank [bank_bic=" + bank_bic + ", bank_name=" + bank_name + "]";
	}
	
}
