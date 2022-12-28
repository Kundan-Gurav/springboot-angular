package com.accountmobile.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accountmobile.enitity.Account;
import com.accountmobile.exception.ResourceNotFoundException;
import com.accountmobile.service.AccountService;
//import com.accountmobile.service.AccountService;

@RestController
@CrossOrigin(origins = "*")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	
	@PostMapping("/add")
	public Account createAccount(@RequestBody Account account)  {
		Account accountObj=accountService.createAccount(account);
		return accountObj;	
}
	
	@GetMapping("/all")
	public List<Account> getAccountDetails(){
		List<Account> listOfAccount =accountService.getAccountService();
		return listOfAccount;	
	}
	
//	@GetMapping()
//	public String getByMobileNumber(@PathVariable("id") long mobile_number) {
//		return accountService.fetchAccountBymobile_number(mobile_number);
//		
//	}
		
	  @PutMapping("/{id}")
	    public Account updateAccount(@RequestBody Account account, @PathVariable("mobile_number") long mobile_number) {
	        return accountService.updateAccount(account, mobile_number);  	
	    }
	  
	  @DeleteMapping("/delete/Account/{id}")
	  public String deleteAccountById(@PathVariable("id") long mobile_number) {
		  accountService.deleteAccountById(mobile_number);
	        return "Deleted Successfully";
	    }
	  
	  @PostMapping("/login")
		public Account loginUser(@RequestBody Account account) throws Exception 
		{
		  long mobilenumber=account.getMobileNumber();
		  String password = account.getPassword();
		  
		  Account acObj=null;
		  if (mobilenumber !=0 && password!=null) {
			acObj=accountService.fetchAccountBymobile_number(mobilenumber, password);
		  }
		  if(acObj == null)
		  {
			  throw new Exception("Your MobileNumber or Password is InValid");
		  }
			return acObj;
		}
	  
	  @GetMapping("/{id}")
	  public Account getByaccountNumber(@PathVariable("id") long mobile_number) {
		  return accountService.getAccountByMobileNumber(mobile_number);
	  }
	 
}

