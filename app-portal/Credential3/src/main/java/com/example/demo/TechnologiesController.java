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
@RequestMapping({"/technologies"})
public class TechnologiesController {
	@Autowired
	private TechnologiesService TechnologiesService;
	
	@PostMapping
	public Technologies create(@RequestBody Technologies Technologies)
	{
		return TechnologiesService.create(Technologies);
	}
	@GetMapping(path = {"/{id}"})
	public Technologies findOne(@PathVariable("id") Long id)
	{
		return TechnologiesService.findById(id);
	}
	@PutMapping(path = {"/{id}"})
	public Technologies update(@PathVariable("id") Long id, @RequestBody Technologies Technologies)
	{
		Technologies.setId(id);
		return TechnologiesService.update(Technologies);
	}
	 @DeleteMapping(path= {"/{id}"}) 
	 public Technologies delete(@PathVariable("id") Long id)
	 {
		 return  TechnologiesService.delete(id);
	 }
	 @GetMapping
	 public List<Technologies> findAll()
	 {
		 return TechnologiesService.findAll();
	 }
	 @GetMapping(path = {"/technologies/{technologies}"})
	 public List<Technologies> findByTechnologies(@PathVariable("technologies") String technologies)
	 {
		 return TechnologiesService.findByTechnologies(technologies);
	 }
}
