package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/payment"})
public class PaymentController {
	@Autowired	
	private PaymentService paymentService;
	 @PostMapping
	public Payment create(@RequestBody Payment payment)
	{
		return paymentService.create(payment);
	}
	 @GetMapping(path = {"/{id}"})
	 public Payment findOne(@PathVariable("id") Long id) {
		 return paymentService.findById(id);
	 }
	 @PutMapping(path = {"/{id}"})
	 public Payment update(@PathVariable("id") Long id,@RequestBody Payment payment)
	 {
		return  paymentService.update(payment);
	 }
	 @DeleteMapping(path= {"/{id}"})
	 public Payment delete(@PathVariable("id") Long id)
	{
		return paymentService.delete(id);
	}
	@GetMapping
	public List<Payment> findAll()
	{
		return paymentService.findAll();
	}
}
