import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Technologies } from '../models/technologies.model';
import { TechnologiesService } from './technologies.service';

@Component({
  selector: 'app-technologies',
  templateUrl: './technologies.component.html',
  styles: []
})
export class TechnologiesComponent implements OnInit {

  technologies: Technologies[];

  constructor(private router: Router, private technologiesService: TechnologiesService) {

  }

  ngOnInit() {
    this.technologiesService.getUsers()
      .subscribe( data => {
        this.technologies = data;
      });
  };

  deleteUser(technology: Technologies): void {
    this.technologiesService.deleteUser(technology)
      .subscribe( data => {
        this.technologies = this.technologies.filter(u => u !== technology);
      })
  };

}


