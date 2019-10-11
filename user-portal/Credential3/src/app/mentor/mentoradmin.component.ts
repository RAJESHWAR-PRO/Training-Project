import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorService } from './mentor.service';

@Component({
  selector: 'app-mentoradmin',
  templateUrl: './mentoradmin.component.html',
  styles: []
})
export class MentorAdminComponent implements OnInit {
   editField:ConstantSourceNode;
   private act:string = null;
  mentors: Mentor[];
  user: Mentor = new Mentor();

  constructor(private router: Router, private mentorService: MentorService) {

  }
  // updateList(mentorId: number, property: string, event: any) {
  //    this.editField = event.target.textContent;
  //   this.users[mentorId][property] = this.editField;
  // }

  updateUser(mentor):void{
    this.mentorService.updateMentor(mentor).subscribe(data => {
      alert(mentor.active);
    })
  }

  changeValue(mentorId: number, property: string, event: any) {
    this.editField = event.target.textContent;
  }
  ngOnInit() {
    this.mentorService.getMentors()
      .subscribe( data => {
        this.mentors = data;
      });
  };

  deleteUser(mentor: Mentor): void {
    this.mentorService.deleteMentor(mentor)
      .subscribe( data => {
        this.mentors = this.mentors.filter(u => u !== mentor);
      })
  };

}


