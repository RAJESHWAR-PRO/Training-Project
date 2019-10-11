import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { Mentor } from '../models/mentor.model';
import { MentorService } from './mentor.service';

@Component({
  selector: 'app-mentorLogin',
  templateUrl: './mentorlogin.component.html',
  styles: []
})
export class MentorLoginComponent {
  // private router1:Router;
  mentors : Array<Mentor>;
  myForm: FormGroup;
  private usr: string = null;
  private pwd: string = null;
  mentor: Mentor = new Mentor();

  constructor(private router: Router, private mentorService: MentorService) {
    // router.navigate(['/users'])
  }
  ngOnInit(){
    // this.myForm = this.FormGroup({
    //   'Email': new FormControl(null, [Validators.required]),
    //   'Password': new FormControl(null, [Validators.required])
    //  })
   }

  searchUser(): void {
    this.mentorService.searchMentor(this.mentor)
      .subscribe( data => {
        if(data.length != 0)
        {
        // alert('Username: '+data[0].userName+' Password: '+data[0].password)
        if((data[0].userName == this.usr) && (data[0].password == this.pwd) && (data[0].active == true))
        {
          alert('permission granted');
          localStorage.setItem('isLoggedIn', "true");
          localStorage.setItem('token', this.mentor.userName);
          localStorage.setItem('tokenId', ""+data[0].mentorId);
          // this.router.navigate(['/users']);
          this.router.navigate(['/mentor']);
        }
        else
        {
          alert('permission not granted');
          // if(this.usr == null && this.pwd == null)
          //   this.router.navigate(['/mentorlogin']);
        }
      }
      else{
        alert('permission not granted');
        // if(this.usr == null && this.pwd == null)
        // this.router.navigate(['/mentorlogin']);
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


