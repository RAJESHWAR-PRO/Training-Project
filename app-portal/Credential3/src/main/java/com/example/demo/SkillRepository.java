package com.example.demo;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface SkillRepository extends Repository<Skill,Long> {
	
	void delete(Skill user);
	 
	 List<Skill> findAll();
	 
	 Skill findOne(Long id);
	 
	Skill save(Skill user);
	 
}
