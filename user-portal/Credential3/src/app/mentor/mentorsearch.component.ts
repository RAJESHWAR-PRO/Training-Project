import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorService } from './mentor.service';
import { TechnologiesService } from '../technologies/technologies.service';
import { Technologies } from '../models/technologies.model';
import { TrainingsService } from '../trainings/trainings.service';
import { Trainings } from '../models/trainings.model';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-mentorsearch',
  templateUrl: './mentorsearch.component.html',
  styles: ['./mentor.component.css'],
})
export class MentorSearchComponent implements OnInit {
   editField:ConstantSourceNode;
   private act:string = null;
   private i:number=0;
   item : Array<Mentor>;
   id : string;
  trainings : Trainings[];
  trainingstech : Trainings[];
  trainingUser : Trainings[];
  mentors: Mentor[];
  users1: Mentor[];
  data1: Mentor[];
  mentor: Mentor = new Mentor();
  technologies: Technologies[];
  technologies1: Technologies[];
  selectedOption:string = this.mentor.userName;
  selectedOption1:string = null;
  private mentordetails:boolean=false;
  private technologydetails:boolean=false;
  private totalMentorDetails:boolean=false;
  private trainerdetails:boolean = false;
  private trainerstechdetails:boolean = false;
  private date:Date = new Date();
  private datepipe:DatePipe = new DatePipe('en-Us');
  // private i:number=0;
  constructor(private router: Router, private mentorService: MentorService,private trainingsService:TrainingsService, private technologiesService:TechnologiesService) {

  }
  // updateList(mentorId: number, property: string, event: any) {
  //    this.editField = event.target.textContent;
  //   this.users[mentorId][property] = this.editField;
  // }
  

  updateUser(user):void{
    this.mentorService.updateMentor(user).subscribe(data => {
      alert(user.active);
    })
  }

  changeValue(mentorId: number, property: string, event: any) {
    this.editField = event.target.textContent;
  }
  ngOnInit() {
    this.mentorService.updateActive()
      .subscribe( data1 => {
        // alert(data[0].active)
        // if(data[1].active == true)
        this.totalMentorDetails = true;
        this.mentors = data1; 
        // alert(data);      
      });
      this.technologiesService.getUsers()
      .subscribe(data1 => {
      this.technologies = data1;
      // alert(data1);
    });  
    this.id = localStorage.getItem('tokenId'); 
    
    // this.trainingUser[0].user.id = this.id;
  };

  Subscribe(mentor2:Mentor):void{
    var value = confirm("Are you Sure?");
    // alert(this.id);
    // alert(value);
    if(value == true)
    {
      this.trainingsService.getTrainings1(mentor2)
      .subscribe(data => {
        // alert(data[0].mentorId);
        this.trainings = data;
        this.trainerdetails = true;
        this.trainerstechdetails = false;
        // }
        // else{
        //   alert('No Data Found');
        // }
        // alert("<h1>"+this.trainings[0].endDate+"</h1>");
      })
    }
  }
  mentorConfirm(trainer: Trainings):void{
    this.trainingsService.putTrainingsUsers(trainer)
    .subscribe(data => {
        this.trainingUser = data;
        // alert(this.trainingUser[0].user.id);
    })
  }
  Subscribe1(technologies:Technologies):void{
    // alert(technologies.techid);
    this.trainingsService.getTechnologies(technologies)
    .subscribe( data => {
      if(data.length != 0){
      this.trainingstech = data;
      this.trainerdetails = false;
      this.trainerstechdetails = true;
  }
  else{
    alert("No data found");
  }
    })
  }
  getByUserName():void{
    this.mentorService.getByMentor(this.selectedOption)
    .subscribe(data => {
      if(data.length != 0)
      {
        this.users1 = data;
        this.mentordetails = true;
        this.technologydetails = false;
        this.totalMentorDetails = false;
        this.trainerdetails = false;
        this.trainerstechdetails = false;
        // alert(this.users1[0].password);
      }
      else{
        this.mentordetails = false;
        this.technologydetails = false;
        this.totalMentorDetails = false;
        this.trainerdetails = false;
        this.trainerstechdetails = false;
        alert('Select an option');
        
      }
    });     
  }
  returnByUserName():Mentor[]{
    alert(this.users1);
    return this.users1;
  }
  getByTechnologies():void{
    this.technologiesService.getByTechnologies(this.selectedOption1)
    .subscribe(data => {
      if(data.length != 0)
      {
      this.technologies1 = data;
      this.technologydetails = true;
      this.mentordetails = false;
      this.totalMentorDetails = false;
      this.trainerdetails = false;
      this.trainerstechdetails = false;
      // alert(this.technologies1[0].id);
      }
      else{
        this.technologydetails = false;
        this.mentordetails = false;
        this.totalMentorDetails = false;
        this.trainerdetails = false;
        this.trainerstechdetails = false;
        alert('Select an option');
      }
    });

  }
  deleteUser(user: Mentor): void {
    this.mentorService.deleteMentor(user)
      .subscribe( data => {
        this.mentors = this.mentors.filter(u => u !== user);
      })
  };
  providers: [DatePipe];

}


