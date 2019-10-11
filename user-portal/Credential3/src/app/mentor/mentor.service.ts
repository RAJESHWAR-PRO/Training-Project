import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Mentor } from '../models/mentor.model';
// import { userInfo } from 'os';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class MentorService {

  constructor(private http:HttpClient) {}

  private mentorUrl = 'http://localhost:8099/Credential3/mentor';
  //private userUrl = '/api';

  public updateActive()
  {
    return this.http.get<Mentor[]>(this.mentorUrl+"/active/true");
  }

  public getByMentor(username)
  {
    return this.http.get<Mentor[]>(this.mentorUrl+"/username/"+username)
  }
  public updateMentor(mentor){
    return this.http.put<Mentor[]>(this.mentorUrl+"/update/"+mentor.mentorId,mentor);
  }

  public searchMentor(mentor){
    return this.http.get<Mentor[]>(this.mentorUrl+"/"+ mentor.userName+"/"+mentor.password);
  }

  public getMentors() {
    return this.http.get<Mentor[]>(this.mentorUrl); 
  }
 
  public deleteMentor(mentor) {
    return this.http.delete(this.mentorUrl + "/"+ mentor.mentorId);
  }
 

  public createMentor(mentor) {
    return this.http.post<Mentor>(this.mentorUrl, mentor);
  }

}
