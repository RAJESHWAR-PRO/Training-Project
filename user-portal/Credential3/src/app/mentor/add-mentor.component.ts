import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorService } from './mentor.service';

@Component({
  templateUrl: './add-mentor.component.html'
})
export class AddMentorComponent {

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
