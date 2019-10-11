import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Trainings } from '../models/trainings.model';
import { TrainingsService } from './trainings.service';
import { Mentor } from '../models/mentor.model';

@Component({
  templateUrl: './add-trainings.component.html'
})
export class AddTrainingsComponent {

  trainings: Trainings = new Trainings();
  mentor: Mentor = new Mentor();

  constructor(private router: Router, private trainingsService: TrainingsService) {

  }

  createTrainings(): void {
    this.trainingsService.createUser(this.trainings)
        .subscribe( data => {
          alert("Trainings record created successfully.");
        });

  };

}
