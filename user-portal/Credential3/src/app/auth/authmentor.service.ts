import { Injectable } from '@angular/core';
// import {  } from './login';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceMentor {

  constructor() { }

  logout(): void {
    localStorage.setItem('isLoggedIn', "false");
    localStorage.removeItem('token');
    localStorage.removeItem('tokenId');
  } 

}