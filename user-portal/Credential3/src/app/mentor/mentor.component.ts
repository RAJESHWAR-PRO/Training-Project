import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorService } from './mentor.service';
import { NgForOf } from '@angular/common';
import { UserService } from '../user/user.service';
import { TrainingsService } from '../trainings/trainings.service';
import { Trainings } from '../models/trainings.model';
import { AuthService } from '../auth/auth.service';
import { AuthServiceMentor } from '../auth/authmentor.service';

@Component({
  selector: 'app-mentor',
  templateUrl: './mentor.component.html',
  styles: []
})
export class MentorComponent implements OnInit {
   editField:ConstantSourceNode;
   private act:string = null;
   private i:number=0;
   item : Array<Mentor>;
  users: Mentor[];
  data1: Mentor[];
  trainingsMentor : Trainings[];
  user: Mentor = new Mentor();
  private username:string = null;
  private mentorid:string = null;
  private mentorProfile:boolean = true;
  private mentorUser:boolean = false;
  private notification:boolean = false;
  private payment:boolean = false;

  constructor(private router: Router, private mentorService: MentorService,
    private trainingsService:TrainingsService, public authService:AuthServiceMentor) {

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
      .subscribe( data => {
        // alert(data[0].active)
        // if(data[1].active == true)
        this.users = data;
               
      });
    this.username = localStorage.getItem('token');
    this.mentorid = localStorage.getItem('tokenId');
  };
  showProfile():void{
    this.mentorProfile = true;
    this.mentorUser = false;
    this.payment = false;
    this.notification = false;
  }

  showNotification():void{
    this.notification = true;
    this.mentorProfile = false;
    this.mentorUser = false;
    this.payment = false;
  }

  showPayment():void{
    this.notification = false;
    this.mentorProfile = false;
    this.mentorUser = false;
    this.payment = true;
  }

  showUser():void{
    this.trainingsService.getTrainings(this.mentorid)
    .subscribe( data => {
      this.trainingsMentor = data;
      this.mentorUser = true;
      this.mentorProfile = false;
      this.notification = false;
    this.payment = false;
      // alert(this.trainingsMentor[0].users[0].id);
    })
  }
  logout():void{
    this.authService.logout();
    this.router.navigate(['']);
  }
  deleteUser(user: Mentor): void {
    this.mentorService.deleteMentor(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


