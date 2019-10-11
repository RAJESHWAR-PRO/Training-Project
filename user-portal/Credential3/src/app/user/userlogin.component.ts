import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { UserService } from './user.service';
import { FormGroup, Validators, FormControl } from '@angular/forms';

@Component({
  selector: 'app-userLogin',
  templateUrl: './userlogin.component.html',
  styles: []
})
export class UserLoginComponent {
  // private router1:Router;
  private userservice1:UserService;
  users : Array<User>;
  myForm: FormGroup;
  private usr: string = null;
  private pwd: string = null;
  user: User = new User();

  constructor(private router: Router, private userService: UserService) {
    // router.navigate(['/users'])
  }
  // ngOnInit(){
  //   this.myForm = this.FormGroup({
  //     'Email': new FormControl(null, [Validators.required]),
  //     'Password': new FormControl(null, [Validators.required])
  //    })
  //  }

  searchUser(): void {
      this.userService.searchUser(this.user)
      .subscribe( data => {
        if(data.length != 0)
        {
        // alert('Username: '+data[0].userName+' Password: '+data[0].password);
        if((data[0].userName == this.usr) && (data[0].password == this.pwd) && (data[0].active == true))
        {
          alert('permission granted');
          localStorage.setItem('isLoggedIn', "true");
          localStorage.setItem('token', this.user.userName);
          localStorage.setItem('tokenId', data[0].id);
          this.router.navigate(['/users']);
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


