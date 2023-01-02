package com.rechargeMobile.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.rechargeMobile.service.RechargeService;


@RestController
@RequestMapping
public class RechargeController {

	@Autowired
	private RechargeService recharge;

	

	
}
