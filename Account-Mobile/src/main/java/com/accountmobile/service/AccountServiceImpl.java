package com.accountmobile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountmobile.enitity.Account;
import com.accountmobile.exception.ResourceNotFoundException;
import com.accountmobile.repository.AccountRepo;


@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepo accountRepository;
	
	@Override
	public Account createAccount(Account account) {
		Account accountObj =accountRepository.save(account);
		return accountObj;
	}

	@Override
	public List<Account> getAccountService() {	
		List<Account> accountDetails =accountRepository.findAll();
		return accountDetails;
	}
	
	@Override
	public void deleteAccountById(long mobile_number) {
		// TODO Auto-generated method stub
		accountRepository.deleteById(mobile_number);
	}

	@Override
	public Account updateAccount(Account account, long mobile_number) {
		Account  accUpdate =accountRepository.findById(mobile_number).get();
		accUpdate.setCustomer_name(account.getCustomer_name());
		accUpdate.setAccount_type(account.getAccount_type());
		accUpdate.setInitial_balance(account.getInitial_balance());
		accountRepository.save(accUpdate);
		return accUpdate;
	}

	
	@Override
	public Account fetchAccountBymobile_number(long mobile_number, String password) {
		// TODO Auto-generated method stub
		return accountRepository.findByMobileNumberAndPassword(mobile_number, password);
	}

	@Override
	public Account getAccountByMobileNumber(long mobile_number) {
		// TODO Auto-generated method stub
		return this.accountRepository.findByMobileNumber(mobile_number);
	}
	

}