package com.rechargeMobile.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private long mobileNumber;
	private String customer_name;
	private String account_type;
	private double initial_balance;
	private String password;
	

	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public double getInitial_balance() {
		return initial_balance;
	}
	public void setInitial_balance(double initial_balance) {
		this.initial_balance = initial_balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Account(long mobile_number, String customer_name, String account_type, double initial_balance,
			String password) {
		super();
		this.mobileNumber = mobile_number;
		this.customer_name = customer_name;
		this.account_type = account_type;
		this.initial_balance = initial_balance;
		this.password = password;
	}
	public Object getMobile_number() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
