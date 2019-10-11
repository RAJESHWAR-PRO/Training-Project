import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorService } from './mentor.service';
import { NgForOf } from '@angular/common';
import { MentorSearchComponent } from './mentorsearch.component';

@Component({
  selector: 'app-mentorresults',
  templateUrl: './mentorresults.component.html',
  styles: []
})
export class MentorResultsComponent implements OnInit {

   editField:ConstantSourceNode;
   private act:string = null;
   private i:number=0;
   item : Array<Mentor>;
  users: Mentor[];
  data1: Mentor[];
  user: Mentor = new Mentor();

  constructor(private router: Router, private mentorService: MentorService,private mentorsearching:MentorSearchComponent) {
    
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
  };

  deleteUser(user: Mentor): void {
    this.mentorService.deleteMentor(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


