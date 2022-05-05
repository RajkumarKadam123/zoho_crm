package com.zohocrm3.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm3.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing , Long> {

}
