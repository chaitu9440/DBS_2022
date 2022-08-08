package com.finalProject.paymentProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalProject.paymentProject.entity.Transaction;


public interface TransactionRepository extends JpaRepository<Transaction, String>{

}
