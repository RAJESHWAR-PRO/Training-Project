import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Payment } from '../models/payment.model';
import { NotificationService } from './notification.service';
import { TrainingsService } from '../trainings/trainings.service';
import { Trainings } from '../models/trainings.model';

@Component({
  selector: 'app-usernotification',
  templateUrl: './usernotification.component.html',
  styles: []
})
export class UserNotificationComponent implements OnInit {

  private userId:string = null;
  private trainings:Trainings[];
  private trainingsnotification:Trainings[];
  users: Payment[];

  constructor(private router: Router, private notificationService: NotificationService,
    private trainingsService:TrainingsService) {

  }

  ngOnInit() {
    this.notificationService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
    this.userId = localStorage.getItem('tokenId');
    this.trainingsService.getTrainings(this.trainings)
    .subscribe(data => {
      
    })
    
  };

  deleteUser(user: Payment): void {
    this.notificationService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


