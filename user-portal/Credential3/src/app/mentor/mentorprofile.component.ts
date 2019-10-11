import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorService } from './mentor.service';
import { NgForOf } from '@angular/common';

@Component({
  selector: 'app-mentorprofile',
  templateUrl: './mentorprofile.component.html',
  styles: []
})
export class MentorProfileComponent implements OnInit {
   editField:ConstantSourceNode;
   private act:string = null;
   private i:number=0;
   item : Array<Mentor>;
  mentors: Mentor[];
  data1: Mentor[];
  // user: Mentor = new Mentor();
  private username:string = null;

  constructor(private router: Router, private mentorService: MentorService) {

  }
  // // updateList(mentorId: number, property: string, event: any) {
  // //    this.editField = event.target.textContent;
  // //   this.users[mentorId][property] = this.editField;
  // // }

  // updateUser(user):void{
  //   this.mentorService.updateUser(user).subscribe(data => {
  //     alert(user.active);
  //   })
  // }

  changeValue(mentorId: number, property: string, event: any) {
    this.editField = event.target.textContent;
  }
  ngOnInit() {
    this.mentorService.updateActive()
      .subscribe( data => {
        // alert(data[0].active)
        // if(data[1].active == true)
        this.mentors = data;
               
      });
    this.username = localStorage.getItem('token');    
  };

  deleteUser(mentor: Mentor): void {
    this.mentorService.deleteMentor(mentor)
      .subscribe( data => {
        this.mentors = this.mentors.filter(u => u !== mentor);
      })
  };

}


