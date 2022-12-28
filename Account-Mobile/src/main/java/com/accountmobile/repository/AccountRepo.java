package com.accountmobile.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accountmobile.enitity.Account;


@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

//	Account findByAccountIdAndPassword(long mobile_number, String password);

	public Account findByMobileNumberAndPassword(long mobile_number, String password);

	public Account findByMobileNumber(long mobile_number);

//	public Optional<Account> getAccountByMobilenumber(long mobileNumber);

}
