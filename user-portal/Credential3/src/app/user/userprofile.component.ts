import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { UserService } from './user.service';
import { FormGroup, Validators, FormControl } from '@angular/forms';

@Component({
  selector: 'app-userprofile',
  templateUrl: './userprofile.component.html',
  styles: []
})
export class UserProfileComponent {
  // private router1:Router;
  private userservice1:UserService;
  users : Array<User>;
  myForm: FormGroup;
  private usr: string = null;
  private pwd: string = null;
  user: User = new User();
  username: String = null;

  constructor(private router: Router, private userService: UserService) {
    // router.navigate(['/users'])
    this.username = localStorage.getItem('token');
  }
  // ngOnInit(){
  //   this.myForm = this.FormGroup({
  //     'Email': new FormControl(null, [Validators.required]),
  //     'Password': new FormControl(null, [Validators.required])
  //    })
  //  }

  searchUser(): void {
      users :  this.userService.searchUser(this.user)
      .subscribe( data => {
        if(data.length != 0)
        {
        // alert('Username: '+data[0].userName+' Password: '+data[0].password);
        if((data[0].userName == this.usr) && (data[0].password == this.pwd) && (data[0].active == true))
        {
          alert('permission granted');
        }
        else
        {
          alert('permission not granted');
          this.usr = '';
          this.pwd = '';
          this.router.navigate(['/userlogin']);
        }
      }
      else{
        alert('permission not granted');
        this.usr = '';
        this.pwd = '';
        this.router.navigate(['/userlogin']);
      }
      });
      // if(this.usr == this.users[0].userName)
      // {
      //   alert('permission granted');
      // }
      // else{
      //   alert('permission not granted');
      // }
      

  };

}


