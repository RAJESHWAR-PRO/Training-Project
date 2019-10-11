package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface TrainingsRepository extends Repository<Trainings, Long> {
	
 void delete(Trainings trainings);
 
 List<Trainings> findAll();
 
 Trainings findOne(Long id);
 
 Trainings save(Trainings trainings);
 
// @Query("select * from Trainings t where t.mentor_id=?")
 List<Trainings> findTrainingById(Long mentorId);
 
// List<Trainings> findTrainingByUserId(Long userId);
 
// @Query("select * from Trainings t where t.id=?")
 Trainings findByIdAndId(Long id, Long mentorId);
 
// Trainings findByIdAndUsers(Long id, Long userId);
 
 List<Trainings> findByStartDate(String startDate);
}
