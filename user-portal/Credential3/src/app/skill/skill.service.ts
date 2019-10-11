import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Skill } from '../models/skill.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class SkillService {

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8099/Credential3/skill';
  //private userUrl = '/api';

  public getUsers() {
    return this.http.get<Skill[]>(this.userUrl); 
  }

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<Skill>(this.userUrl, user);
  }

}
