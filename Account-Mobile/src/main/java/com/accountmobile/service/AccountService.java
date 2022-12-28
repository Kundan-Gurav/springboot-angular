package com.accountmobile.service;

import java.util.List;

import com.accountmobile.enitity.Account;
import com.accountmobile.exception.ResourceNotFoundException;

public interface AccountService {

	Account createAccount(Account account);

	List<Account> getAccountService();

	void deleteAccountById(long mobile_number);

	Account updateAccount(Account account, long mobile_number);

	Account fetchAccountBymobile_number(long mobile_number, String password);
	
	Account getAccountByMobileNumber(long mobile_number);
	
}
