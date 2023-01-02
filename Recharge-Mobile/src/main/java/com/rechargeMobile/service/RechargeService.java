package com.rechargeMobile.service;

import com.rechargeMobile.entity.Account;
import com.rechargeMobile.entity.Recharge;

public interface RechargeService {

	Account updateAccount(Account account, long mobileNumber);

	Recharge getRecharge(long mobileNumber, Double rechargeAmount) throws Exception;

	Recharge addRecharge(String mobNo, double rechargeAmt, int acc_id);
	
}

