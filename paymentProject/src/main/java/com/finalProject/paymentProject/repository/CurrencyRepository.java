package com.finalProject.paymentProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalProject.paymentProject.entity.Currency;

public interface CurrencyRepository extends JpaRepository<Currency, String>{

}
