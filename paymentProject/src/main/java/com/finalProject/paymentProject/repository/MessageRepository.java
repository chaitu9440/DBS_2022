package com.finalProject.paymentProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finalProject.paymentProject.entity.Message;


public interface MessageRepository extends JpaRepository<Message, Integer>{

}
