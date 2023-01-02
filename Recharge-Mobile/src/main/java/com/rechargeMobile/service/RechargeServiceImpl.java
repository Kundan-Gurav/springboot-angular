package com.rechargeMobile.service;

//import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.rechargeMobile.entity.Account;
import com.rechargeMobile.entity.Recharge;
import com.rechargeMobile.exception.AccountNotFoundException;
import com.rechargeMobile.repository.RechargeRepo;

@Service
public class RechargeServiceImpl implements RechargeService
{

	@Autowired
	private RechargeRepo rechargeRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	

	
	@Override
    public Recharge addRecharge(String mobNo, double rechargeAmt,int acc_id) {
        Recharge recharge = null;
        Account acc = getAccountDetails(acc_id);
        if(acc.getMobile_number().equals(mobNo))
        {
            if(acc.getInitial_balance() > rechargeAmt)
            {
                Recharge recObj =new Recharge();
                recObj.setInitialBalance(acc.getInitial_balance()-rechargeAmt);
                recObj.setMobile_number(mobNo);
                recObj.setRechargeAmount(rechargeAmt);
                System.out.println(recObj.getMobile_number());
                System.out.println(recObj.getInitialBalance());
                System.out.println(recObj.getRechargeAmount());
                recharge =rechargeRepo.save(recObj);
            }    
        }
        return recharge;
    }

	private Account getAccountDetails(int acc_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account updateAccount(Account account, long mobileNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recharge getRecharge(long mobileNumber, Double rechargeAmount) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
