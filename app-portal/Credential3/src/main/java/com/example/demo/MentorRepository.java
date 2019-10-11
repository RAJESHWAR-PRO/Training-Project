package com.example.demo;
import java.util.List;

import org.springframework.data.repository.Repository;

public interface MentorRepository extends Repository<Mentor, Long>
   {
  	 void delete(Mentor mentor);
		 
		 List<Mentor> findAll();
		 
		 Mentor findOne(Long mentorId);
		 
		 Mentor save(Mentor mentor);
		 
		 List<Mentor> findByUserNameAndPassword(String username,String password);
		 
//		 List<Mentor> updateMentors(Long id, Mentor mentor);
		 
		 List<Mentor> findByActive(boolean active);
		 
		 List<Mentor> findByUserName(String username);
}