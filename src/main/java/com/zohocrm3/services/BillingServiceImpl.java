package com.zohocrm3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm3.entities.Billing;
import com.zohocrm3.repositeries.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingService;
	
	@Override
	public void generateOneBill(Billing bill) {

	}

}
