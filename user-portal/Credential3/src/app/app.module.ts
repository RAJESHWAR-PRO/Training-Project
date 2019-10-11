import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { AddUserComponent } from './user/add-user.component';
import { AppRoutingModule } from './app.routing.module';
import {UserService} from './user/user.service';
import {HttpClientModule} from "@angular/common/http";
import { AddMentorComponent } from './mentor/add-mentor.component';
import { MentorComponent } from './mentor/mentor.component';
import {MentorService} from './mentor/mentor.service';
import { TrainingsComponent } from './trainings/trainings.component';
import {TrainingsService} from './trainings/trainings.service';
import { TechnologiesComponent } from './technologies/technologies.component';
import {TechnologiesService} from './technologies/technologies.service';
import { PaymentComponent } from './payment/payment.component';
import {PaymentService} from './payment/payment.service';
import { AddSkillComponent } from './skill/add-skill.component';
import { SkillComponent } from './skill/skill.component';
import {SkillService} from './skill/skill.service';
import { AddTechnologiesComponent } from './technologies/add-technologies.component';
import { AddTrainingsComponent } from './trainings/add-trainings.component';
import { AddPaymentComponent } from './payment/add-payment.component';
import { UserLoginComponent } from './user/userlogin.component';
import { MentorLoginComponent } from './mentor/mentorlogin.component';
import { MentorAdminComponent } from './mentor/mentoradmin.component';
import { AdminComponent } from './admin/admin.component';
import { UserAdminComponent } from './user/useradmin.component';
import { UserSignupComponent } from './user/usersignup.component';
import { MentorSignupComponent } from './mentor/mentorsignup.component';
import { LoginComponent } from './login/login.component';
import { MentorSearchComponent } from './mentor/mentorsearch.component';
import { MentorResultsComponent } from './mentor/mentorresults.component';
import { UserProfileComponent } from './user/userprofile.component';
import { UserNotificationComponent } from './notifications/usernotification.component';
import { NotificationService } from './notifications/notification.service';
import { AdminLoginComponent } from './admin/adminlogin.component';
import { MentorProfileComponent } from './mentor/mentorprofile.component';
import { MentorUserComponent } from './mentor/mentoruser.component';
import { MentorNotificationComponent } from './mentor/mentornotification.component';
import { PaymentMentorComponent } from './payment/paymentmentor.component';


@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    MentorComponent,
    TrainingsComponent,
    TechnologiesComponent,
    PaymentComponent,
    SkillComponent,
    AddUserComponent,
    AddMentorComponent,
    AddSkillComponent,
    AddTechnologiesComponent,
    AddTrainingsComponent,
    AddPaymentComponent,
    UserLoginComponent,
    MentorLoginComponent,
    MentorAdminComponent,
    AdminComponent,
    UserAdminComponent,
    UserSignupComponent,
    UserProfileComponent,
    MentorSignupComponent,
    LoginComponent,
    MentorSearchComponent,
    MentorResultsComponent,
    UserNotificationComponent,
    AdminLoginComponent,
    MentorProfileComponent,
    MentorUserComponent,
    MentorNotificationComponent,
    PaymentMentorComponent
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UserService,MentorService,TrainingsService,TechnologiesService,
    PaymentService,SkillService,NotificationService],
  bootstrap: [AppComponent]
})
export class AppModule { }
