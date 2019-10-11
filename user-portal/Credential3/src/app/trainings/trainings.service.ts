import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';


import { Trainings } from '../models/trainings.model';
import { MentorSearchComponent } from '../mentor/mentorsearch.component';
import { Mentor } from '../models/mentor.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class TrainingsService {

  private date:string = new Date().toISOString().slice(0,10); 
  private id:number=0;

  constructor(private http:HttpClient) {
    
  }

  private trainingsUrl = 'http://localhost:8099/Credential3/trainings';
  //private userUrl = '/api';
  
  // private mns:MentorSearchComponent ;
  
  public putTrainingsUsers(trainings)
  {
    // return null;
    alert(localStorage.getItem('tokenId'));
    return this.http.get<Trainings[]>(this.trainingsUrl+"/submitTrainingToUser/"+trainings.id+"/"+localStorage.getItem('tokenId'));
  }

  public getTrainings(mentor)
  {
    // alert(this.date);
    return this.http.get<Trainings[]>(this.trainingsUrl+"/findByMentor/"+mentor+"/"+this.date);
  }
  public getTrainings1(mentor)
  {
    // alert(this.date);
    return this.http.get<Trainings[]>(this.trainingsUrl+"/findByMentor/"+mentor.mentorId+"/"+this.date);
  }

  public getTechnologies(technology)
  {
    return this.http.get<Trainings[]>(this.trainingsUrl+"/findTechnology/"+technology.techid+"/"+this.date);
  }
 public rejectedRecord(trainings,trainingsMentor)
 {
   return this.http.get<Trainings[]>(this.trainingsUrl+"/deleteRecord/"+1+"/"+trainings.id);
 }
  public getUsers() {
    return this.http.get<Trainings[]>(this.trainingsUrl); 
  }

  public deleteUser(user) {
    return this.http.delete(this.trainingsUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<Trainings>(this.trainingsUrl, user);
  }

}
