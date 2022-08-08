package com.finalProject.paymentProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalProject.paymentProject.entity.Bank;


public interface BankRepository extends JpaRepository<Bank, String>{

}
