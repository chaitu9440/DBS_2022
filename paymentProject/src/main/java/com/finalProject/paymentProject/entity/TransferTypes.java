package com.finalProject.paymentProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransferTypes {

	@Id
	private char transfer_type_code;
	private String transfer_type_description;
	
	public TransferTypes() {
		// TODO Auto-generated constructor stub
	}

	public TransferTypes(char transfer_type_code, String transfer_type_description) {
		super();
		this.transfer_type_code = transfer_type_code;
		this.transfer_type_description = transfer_type_description;
	}

	public char getTransfer_type_code() {
		return transfer_type_code;
	}

	public void setTransfer_type_code(char transfer_type_code) {
		this.transfer_type_code = transfer_type_code;
	}

	public String getTransfer_type_description() {
		return transfer_type_description;
	}

	public void setTransfer_type_description(String transfer_type_description) {
		this.transfer_type_description = transfer_type_description;
	}

	@Override
	public String toString() {
		return "TransferTypes [transfer_type_code=" + transfer_type_code + ", transfer_type_description="
				+ transfer_type_description + "]";
	}
	
}
