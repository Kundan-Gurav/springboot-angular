package com.rechargeMobile.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recharge {

	@Id
	private long mobileNumber;
	private double rechargeAmount;
	private double initial_balance;
	public Double getInitialBalance() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setInitialBalance(double d) {
		// TODO Auto-generated method stub
		
	}
	public void setMobile_number(String mobNo) {
		// TODO Auto-generated method stub
		
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public double getRechargeAmount() {
		return rechargeAmount;
	}
	public double getInitial_balance() {
		return initial_balance;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setRechargeAmount(double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}
	public void setInitial_balance(double initial_balance) {
		this.initial_balance = initial_balance;
	}
	public char[] getMobile_number() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
