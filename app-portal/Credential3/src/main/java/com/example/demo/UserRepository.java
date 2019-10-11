package com.example.demo;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, Long> {
	
	void delete(User user);
	List<User> findAll();
	User findOne(Long id);
	User save(User user);
	List<User> findByUserNameAndPassword(String userName,String password);
	List<User> findByActive(boolean active);
}
