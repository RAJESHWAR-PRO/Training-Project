package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TechnologiesServiceImpl implements TechnologiesService {
	@Autowired
	private TechnologiesRepository repository;
	
	@Override
	public Technologies create(Technologies Technologies) {
		// TODO Auto-generated method stub
		return repository.save(Technologies);
	}

	@Override
	public Technologies delete(Long id) {
		// TODO Auto-generated method stub
		Technologies Technologies = findById(id);
		if(Technologies != null)
		{
			repository.delete(Technologies);
		}
		return Technologies;
	}

	@Override
	public List<Technologies> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Technologies findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public Technologies update(Technologies Technologies) {
		// TODO Auto-generated method stub
		return repository.save(Technologies);
	}

	@Override
	public List<Technologies> findByTechnologies(String technologies) {
		// TODO Auto-generated method stub
		return repository.findByTechnologies(technologies);
	}

}
