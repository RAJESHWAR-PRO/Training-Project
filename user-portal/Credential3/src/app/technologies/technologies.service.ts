import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Technologies } from '../models/technologies.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class TechnologiesService {

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8099/Credential3/technologies';
  //private userUrl = '/api';
  public getByTechnologies(tech)
  {
    return this.http.get<Technologies[]>(this.userUrl+"/technologies/"+tech);
  }

  public getUsers() {
    return this.http.get<Technologies[]>(this.userUrl); 
  }

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<Technologies>(this.userUrl, user);
  }

}
