package com.example.demo;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface PaymentRepository extends Repository<Payment, Long> {
		
		 void delete(Payment payment);
		 
		 List<Payment> findAll();
		 
		 Payment findOne(Long id);
		 
		 Payment save(Payment payment);
		}
