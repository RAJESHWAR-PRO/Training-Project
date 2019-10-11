import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { User } from '../models/user.model';
import { Router } from '@angular/router';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class UserService {
  private router:Router;
  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8099/Credential3/users';
  //private userUrl = '/api';

  public updateActive()
  {
    return this.http.get<User[]>(this.userUrl+"/active/true");
  }
  public searchUser(user){
   
    return this.http.get<User[]>(this.userUrl+"/"+ user.userName+"/"+user.password);
  }

  public updateUser(user){
    return this.http.put<User[]>(this.userUrl+"/update/"+user.id,user);
  }
  public getUsers() {
    return this.http.get<User[]>(this.userUrl); 
  }

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<User>(this.userUrl, user);
  }

}
