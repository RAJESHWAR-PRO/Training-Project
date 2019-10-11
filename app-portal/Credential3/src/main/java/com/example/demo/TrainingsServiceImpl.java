package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TrainingsServiceImpl implements TrainingsService {
	@Autowired
	private TrainingsRepository repository;
	
	@Override
	public Trainings create(Trainings trainings) {
		// TODO Auto-generated method stub
		return repository.save(trainings);
	}

	@Override
	public Trainings delete(Long id) {
		// TODO Auto-generated method stub
		Trainings trainings = findById(id);
		if(trainings != null)
		{
			repository.delete(trainings);
		}
		return trainings;
	}

	@Override
	public List<Trainings> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Trainings findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public Trainings update(Trainings trainings) {
		// TODO Auto-generated method stub
		return repository.save(trainings);
	}

	

	@Override
	public List<Trainings> findTrainingById(Long mentorId) {
		// TODO Auto-generated method stub
		return repository.findTrainingById(mentorId);
	}

	@Override
	public List<Trainings> findTrainingByUserId(Long userId) {
		// TODO Auto-generated method stub
//		return repository.findTrainingByUserId(userId);
		return null;
	}

	@Override
	public Trainings findByIdAndId(Long id, Long mentorId) {
		// TODO Auto-generated method stub
		return repository.findByIdAndId(id, mentorId);
	}

//	@Override
//	public Trainings findByIdAndUsers(Long id, Long userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Trainings> findByStartDate(String startDate) {
		// TODO Auto-generated method stub
		return repository.findByStartDate(startDate);
	}

//	@Override
//	public Trainings findByIdAndUserId(Long id, Long userId) {
//		// TODO Auto-generated method stub
//		return repository.findByIdAndUserId(id, userId);
//	}

}
