package com.example.demo;

import java.util.List;

public interface PaymentService {
	
	Payment create(Payment payment);
	 
	 Payment delete(Long id);
	 
	 List<Payment> findAll();
	 
	 Payment findById(Long id);
	 
	 Payment update(Payment payment);
}