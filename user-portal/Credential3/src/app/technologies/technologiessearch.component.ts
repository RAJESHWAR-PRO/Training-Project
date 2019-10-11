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

  users: Technologies[];

  constructor(private router: Router, private technologiesService: TechnologiesService) {

  }

  ngOnInit() {
    this.technologiesService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: Technologies): void {
    this.technologiesService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


