package com.example.demo;

import java.util.List;

public interface TechnologiesService {

	 Technologies create(Technologies Technologies);
	 
	 Technologies delete(Long id);
	 
	 List<Technologies> findAll();
	 
	 Technologies findById(Long id);
	 
	 Technologies update(Technologies Technologies);
	 
	 List<Technologies> findByTechnologies(String technologies);
}
