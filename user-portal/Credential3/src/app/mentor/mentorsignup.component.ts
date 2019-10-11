import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorService } from './mentor.service';

@Component({
  templateUrl: './mentorsignup.component.html'
})
export class MentorSignupComponent {

  mentor: Mentor = new Mentor();

  constructor(private router: Router, private mentorService: MentorService) {

  }

  createMentor(): void {
    this.mentorService.createMentor(this.mentor)
        .subscribe( data => {
          alert("Mentor record created successfully.");
        });

  };

}
