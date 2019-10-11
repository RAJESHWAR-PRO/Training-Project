import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Payment } from '../models/payment.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class NotificationService {

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8099/Credential3/payment';
  //private userUrl = '/api';

  public getUsers() {
    return this.http.get<Payment[]>(this.userUrl); 
  }

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<Payment>(this.userUrl, user);
  }

}
