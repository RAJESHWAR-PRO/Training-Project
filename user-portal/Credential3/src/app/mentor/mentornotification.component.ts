import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorService } from './mentor.service';
import { NgForOf } from '@angular/common';
import { UserService } from '../user/user.service';
import { TrainingsService } from '../trainings/trainings.service';
import { Trainings } from '../models/trainings.model';
import { AuthService } from '../auth/auth.service';
import { User } from '../models/user.model';
import { AuthServiceMentor } from '../auth/authmentor.service';

@Component({
  selector: 'app-mentornotification',
  templateUrl: './mentornotification.component.html',
  styles: []
})
export class MentorNotificationComponent implements OnInit {
   editField:ConstantSourceNode;
   private act:string = null;
   private i:number=0;
   item : Array<Mentor>;
   count:number = 0;
  mentors: Mentor[];
//   trainingsTechnology:Trainings[];
  trainingsMentor : Trainings[];
  trainingsTechnology:User[];
  userMentor : Trainings[];
  user: Mentor = new Mentor();
  private username:string = null;
  private mentorid:string = null;
  private studentList:boolean = false;
  private notstudentList:boolean = false;

  constructor(private router: Router, private mentorService: MentorService,
    private trainingsService:TrainingsService, private authService:AuthServiceMentor) {

  }
  // updateList(mentorId: number, property: string, event: any) {
  //    this.editField = event.target.textContent;
  //   this.users[mentorId][property] = this.editField;
  // }

  updateUser(mentor):void{
    this.mentorService.updateMentor(mentor).subscribe(data => {
    //   alert(user.active);
    })
  }
  reject(trainings):void{
    this.trainingsService.rejectedRecord(trainings,this.trainingsMentor).subscribe(data=>{})
  }
  ngOnInit() {
    this.username = localStorage.getItem('token');
    this.mentorid = localStorage.getItem('tokenId');
    this.trainingsService.getTrainings(this.mentorid)
    .subscribe( data => {
      if(data.length != 0)
      {
      this.trainingsTechnology = data[0].users;
      this.trainingsMentor = data;
      this.count = data[0].users.length;
      this.studentList = true;
      this.notstudentList = false;
    }
    else{
      this.studentList = false;
      this.notstudentList = true;
    }

    //   alert(this.count);
    //   alert(this.mentorid);
      // alert(this.trainingsMentor[0].users[0].id);
    })
  };
 
  logout():void{
    this.authService.logout();
    this.router.navigate(['']);
  }
  deleteUser(mentor: Mentor): void {
    this.mentorService.deleteMentor(mentor)
      .subscribe( data => {
        this.mentors = this.mentors.filter(u => u !== mentor);
      })
  };

}


