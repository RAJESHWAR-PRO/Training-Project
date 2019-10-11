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
@RequestMapping({"/skill"})
public class SkillController {
	
	@Autowired	
	private SkillService skillService;
	 @PostMapping
	public Skill create(@RequestBody Skill user)
	{
		return skillService.create(user);
	}
	 @GetMapping(path = {"/{id}"})
	 public Skill findOne(@PathVariable("id") Long id) {
		 return skillService.findById(id);
	 }
	 @PutMapping(path = {"/{id}"})
	 public Skill update(@PathVariable("id") Long id,@RequestBody Skill user)
	 {
		return  skillService.update(user);
	 }
	 @DeleteMapping(path= {"/{id}"})
	 public Skill delete(@PathVariable("id") Long id)
	{
		return skillService.delete(id);
	}
	@GetMapping
	public List<Skill> findAll()
	{
		return skillService.findAll();
	}
	}
