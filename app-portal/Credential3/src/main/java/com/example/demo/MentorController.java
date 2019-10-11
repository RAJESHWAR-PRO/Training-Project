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
@RequestMapping({"/mentor"})
public class MentorController  {
	
	@Autowired	
	private MentorService mentorService;
	
	 @PostMapping
	public Mentor create(@RequestBody Mentor mentor)
	{
		return mentorService.create(mentor);
	}
	 @GetMapping(path = {"/{mentorId}"})
	 public Mentor findOne(@PathVariable("mentorId") Long id) {
		 return mentorService.findById(id);
	 }
	 @PutMapping(path = {"/update/{mentorId}"})
	 public Mentor update(@PathVariable("mentorId") Long id,@RequestBody Mentor mentor)
	 {
		return  mentorService.update(mentor);
	 }
	 @DeleteMapping(path= {"/{mentorId}"})
	 public Mentor delete(@PathVariable("mentorId") Long id)
	{
		return mentorService.delete(id);
	}
	@GetMapping
	public List<Mentor> findAll()
	{
		return mentorService.findAll();
	}
	@GetMapping(path= {"/{Username}/{Password}"})
	public List<Mentor> findByUserNameAndPassword(@PathVariable("Username") String username,@PathVariable("Password") String password)
	{
		return mentorService.findByUserNameAndPassword(username, password);
		
	}
	@GetMapping(path = {"/active/{active}"})
	public List<Mentor> findByActive(@PathVariable("active") boolean active)
	{
		return mentorService.findByActive(active);
	}
	@GetMapping(path = {"/username/{username}"})
	public List<Mentor> findByUserName(@PathVariable("username") String username)
	{
		return mentorService.findByUserName(username);
	}
}
