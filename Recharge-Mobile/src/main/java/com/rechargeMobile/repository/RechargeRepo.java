package com.rechargeMobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rechargeMobile.entity.Recharge;

@Repository
public interface RechargeRepo extends JpaRepository <Recharge ,Long>{

	//Recharge findByMobileNum(String mobileNum);

}
