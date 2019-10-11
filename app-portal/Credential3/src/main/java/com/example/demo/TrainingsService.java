package com.example.demo;

import java.util.Date;
import java.util.List;

public interface TrainingsService {

	 Trainings create(Trainings trainings);
	 
	 Trainings delete(Long id);
	 
	 List<Trainings> findAll();
	 
	 Trainings findById(Long id);
	 
	 Trainings update(Trainings trainings);
	 
	 List<Trainings> findTrainingById(Long mentorId);
	 
	 List<Trainings> findTrainingByUserId(Long userId);
	 
	 Trainings findByIdAndId(Long id, Long mentorId);
	 
//	 Trainings findByIdAndUsers(Long id, Long userId);
	 
	 List<Trainings> findByStartDate(String startDate);
}
