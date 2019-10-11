package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/trainings"})
public class TrainingsController {
	@Autowired
	private TrainingsService trainingsService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MentorRepository mentorRepository;
	
	@PostMapping
	public Trainings create(@RequestBody Trainings trainings)
	{
		return trainingsService.create(trainings);
	}
	@GetMapping(path = {"/{id}"})
	public Trainings findOne(@PathVariable("id") Long id)
	{
		return trainingsService.findById(id);
	}
	@PutMapping(path = {"/{id}"})
	public Trainings update(@PathVariable("id") Long id, @RequestBody Trainings trainings)
	{
		trainings.setId(id);
		return trainingsService.update(trainings);
	}
	 @DeleteMapping(path= {"/{id}"}) 
	 public Trainings delete(@PathVariable("id") Long id)
	 {
		 return  trainingsService.delete(id);
	 }
	 @GetMapping
	 public List<Trainings> findAll()
	 {
		 return trainingsService.findAll();
	 }
	 
	 @GetMapping("/findTrainingByMentorId/{mentorId}")
	 public List<Trainings> getCoursesByInstructor(@PathVariable(value = "mentorId") Long mentorId){
		 return trainingsService.findTrainingById(mentorId); 
	 }
	 
	 @GetMapping("/startDate/{startDate}")
	 public  List<Trainings> findByStartDate(@PathVariable("startDate") String startDate)
	 {
		 return trainingsService.findByStartDate(startDate);
	 }
	 
//	 @GetMapping("/User/{userId}/users")
//	    public List < User > getUserByInstructor(@PathVariable(value = "userId") Long id) {
//	        return userRepository.findById(id);
//	    }
//	 @GetMapping("/Mentor/{mentorId}/mentor")
//	    public List < Mentor > getMentorByInstructor(@PathVariable(value = "mentorId") Long id) {
//	        return mentorRepository.findByMentorId(id);
//	    }
}
