import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { UserService } from './user.service';
import { AuthService } from '../auth/auth.service';


@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styles: []
})
export class UserComponent implements OnInit {

  users: User[];
  username : String = null;
  user:User = new User();
  showMentor1:boolean=false;
  showPayment1:boolean=false;
  showPaymentHistory1:boolean=false;
  showProfile1:boolean = true;
  id : number=0;

  constructor(private router: Router, private userService: UserService,public authService: AuthService) {

  }

  ngOnInit() {
    this.userService.updateActive()
      .subscribe( data => {
        // alert(data[0].active)
        // if(data[1].active == true)
        this.users = data;        
      });
      this.username = localStorage.getItem('token');
      // this.id = Number(localStorage.getItem('tokenId'));
      // alert(this.id);
  };

  logout():void{
    this.authService.logout();
    this.router.navigate(['']);
  }
  showProfile():void{
    this.showPayment1 = false;
    this.showPaymentHistory1=false;
    this.showMentor1=false;
    this.showProfile1=true;
  }

  showPayment():void{
    this.showPayment1 = true;
    this.showPaymentHistory1=false;
    this.showMentor1=false;
    this.showProfile1=false;
  }
  show():void{
    this.showPaymentHistory1 = true;
    this.showPayment1 = false;
    this.showMentor1=false;
    this.showProfile1=false;
  }

  showMentor():void{
    this.showMentor1 = true;
    this.showPayment1 = false;
    this.showPaymentHistory1 = false;
    this.showProfile1=false;
  }

  deleteUser(user: User): void {
    this.userService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


