package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {
	@Autowired
	private SkillRepository repository;

	@Override
	public Skill create(Skill user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public Skill delete(Long id) {
		// TODO Auto-generated method stub
		Skill user =findById(id);
		if(user != null)
		{
			repository.delete(user);
		}
		return user;
	}

	@Override
	public List<Skill> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Skill findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public Skill update(Skill user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

}
