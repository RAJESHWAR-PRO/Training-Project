package com.example.demo;

import java.util.List;

public interface SkillService {
	Skill create(Skill user);
	Skill delete(Long id);
	List<Skill> findAll();
	Skill findById(Long id);
	Skill update(Skill user);
}
