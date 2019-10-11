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
@RequestMapping({"/users"})
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public User create(@RequestBody User user) {
		return userService.create(user);
	}
	
	@GetMapping(path= {"/{id}"})
	public User findOne(@PathVariable("id") Long id) {
		return userService.findById(id);
	}
	@GetMapping(path= {"/{username}/{password}"})
	public List<User> findByUserNameAndPassword(@PathVariable("username") String username,@PathVariable("password") String password) {
//		return userService.findById(id);
		return userService.findByUserNameandPassword(username, password);
	}
	
	
	@PutMapping(path = {"/update/{id}"})
	public User update(@PathVariable("id") Long id, @RequestBody User user){
		return userService.update(user);
	}
	@DeleteMapping(path = {"/{id}"})
	public User delete(@PathVariable("id") Long id)
	{
		return userService.delete(id);
	}
	@GetMapping
	public List<User> findAll()
	{
		return userService.findAll();
	}
	@GetMapping(path = {"/active/{active}"})
	public List<User> findByActive(@PathVariable("active") boolean active)
	{
		return userService.findByActive(active);
	}
}
