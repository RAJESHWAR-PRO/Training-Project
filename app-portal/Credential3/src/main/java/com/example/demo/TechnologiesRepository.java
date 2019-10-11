package com.example.demo;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface TechnologiesRepository extends Repository<Technologies, Long> {
	
 void delete(Technologies Technologies);
 
 List<Technologies> findAll();
 
 Technologies findOne(Long id);
 
 Technologies save(Technologies Technologies);
 
 List<Technologies> findByTechnologies(String technologies);
}
