package com.sangamone.reverseofstring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="string1reverse")
public class String1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String message;
	private String rmessage;
	public String1(int id, String message, String rmessage) {
		super();
		this.id = id;
		this.message = message;
		this.rmessage = rmessage;
	}
	public String1() {
		//super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "String1 [id=" + id + ", message=" + message + ", rmessage=" + rmessage + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRmessage() {
		return rmessage;
	}
	public void setRmessage(String rmessage) {
		this.rmessage = rmessage;
	}
	
	

}
