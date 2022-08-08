package com.finalProject.paymentProject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	private int message_code;
	private String instruction;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}

	public Message(int message_code, String instruction) {
		super();
		this.message_code = message_code;
		this.instruction = instruction;
	}

	public int getMessage_code() {
		return message_code;
	}

	public void setMessage_code(int message_code) {
		this.message_code = message_code;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	@Override
	public String toString() {
		return "Message [message_code=" + message_code + ", instruction=" + instruction + "]";
	}
	
}
