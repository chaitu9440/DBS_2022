package com.finalProject.paymentProject.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	private String transaction_id;
	private String customer_id;
	private String currency_code;
	private String sender_bic;
	private String receiver_bic;
	private String receiver_account_holder_number;
	private String receiver_account_holder_name;
	private char transfer_type;
	private String message_code;
	private double currency_amount;
	private double transfer_fees;
	private double inr_amount;
	private Date transfer_date;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(String transaction_id, String customer_id, String currency_code, String sender_bic,
			String receiver_bic, String receiver_account_holder_number, String receiver_account_holder_name,
			char transfer_type, String message_code, double currency_amount, double transfer_fees, double inr_amount,
			Date transfer_date) {
		super();
		this.transaction_id = transaction_id;
		this.customer_id = customer_id;
		this.currency_code = currency_code;
		this.sender_bic = sender_bic;
		this.receiver_bic = receiver_bic;
		this.receiver_account_holder_number = receiver_account_holder_number;
		this.receiver_account_holder_name = receiver_account_holder_name;
		this.transfer_type = transfer_type;
		this.message_code = message_code;
		this.currency_amount = currency_amount;
		this.transfer_fees = transfer_fees;
		this.inr_amount = inr_amount;
		this.transfer_date = transfer_date;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCurrency_code() {
		return currency_code;
	}

	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

	public String getSender_bic() {
		return sender_bic;
	}

	public void setSender_bic(String sender_bic) {
		this.sender_bic = sender_bic;
	}

	public String getReceiver_bic() {
		return receiver_bic;
	}

	public void setReceiver_bic(String receiver_bic) {
		this.receiver_bic = receiver_bic;
	}

	public String getReceiver_account_holder_number() {
		return receiver_account_holder_number;
	}

	public void setReceiver_account_holder_number(String receiver_account_holder_number) {
		this.receiver_account_holder_number = receiver_account_holder_number;
	}

	public String getReceiver_account_holder_name() {
		return receiver_account_holder_name;
	}

	public void setReceiver_account_holder_name(String receiver_account_holder_name) {
		this.receiver_account_holder_name = receiver_account_holder_name;
	}

	public char getTransfer_type() {
		return transfer_type;
	}

	public void setTransfer_type(char transfer_type) {
		this.transfer_type = transfer_type;
	}

	public String getMessage_code() {
		return message_code;
	}

	public void setMessage_code(String message_code) {
		this.message_code = message_code;
	}

	public double getCurrency_amount() {
		return currency_amount;
	}

	public void setCurrency_amount(double currency_amount) {
		this.currency_amount = currency_amount;
	}

	public double getTransfer_fees() {
		return transfer_fees;
	}

	public void setTransfer_fees(double transfer_fees) {
		this.transfer_fees = transfer_fees;
	}

	public double getInr_amount() {
		return inr_amount;
	}

	public void setInr_amount(double inr_amount) {
		this.inr_amount = inr_amount;
	}

	public Date getTransfer_date() {
		return transfer_date;
	}

	public void setTransfer_date(Date transfer_date) {
		this.transfer_date = transfer_date;
	}

	@Override
	public String toString() {
		return "Transaction [transaction_id=" + transaction_id + ", customer_id=" + customer_id + ", currency_code="
				+ currency_code + ", sender_bic=" + sender_bic + ", receiver_bic=" + receiver_bic
				+ ", receiver_account_holder_number=" + receiver_account_holder_number
				+ ", receiver_account_holder_name=" + receiver_account_holder_name + ", transfer_type=" + transfer_type
				+ ", message_code=" + message_code + ", currency_amount=" + currency_amount + ", transfer_fees="
				+ transfer_fees + ", inr_amount=" + inr_amount + ", transfer_date=" + transfer_date + "]";
	}
	
}
