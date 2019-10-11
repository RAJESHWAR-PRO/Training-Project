import { Router } from '@angular/router';
import { Component } from '@angular/core';

@Component({
    selector: 'app-adminLogin',
    templateUrl: './adminlogin.component.html',
    styles: []
  })
export class AdminLoginComponent
{
   private usr:string = null;
   private pwd:string = null;

   constructor(private router:Router){

   }

    SearchAdmin():void{
        if(this.usr == "admin" && this.pwd == "admin")
        {
            this.router.navigate(['admin']);
        }
    }
}