import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { UserComponent } from './user/user.component';
import { AddUserComponent } from './user/add-user.component';
import { AddMentorComponent } from './mentor/add-mentor.component';
import { MentorComponent } from './mentor/mentor.component';
import { TrainingsComponent } from './trainings/trainings.component';
import { TechnologiesComponent } from './technologies/technologies.component';
import { PaymentComponent } from './payment/payment.component';
import { AddSkillComponent } from './skill/add-skill.component';
import {  SkillComponent } from './skill/skill.component';
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
import { AuthGuard } from './auth/auth.guard';
import { UserProfileComponent } from './user/userprofile.component';
import { UserNotificationComponent } from './notifications/usernotification.component';
import { AdminLoginComponent } from './admin/adminlogin.component';
import { MentorProfileComponent } from './mentor/mentorprofile.component';
import { MentorUserComponent } from './mentor/mentoruser.component';
import { AuthGuardMentor } from './auth/authmentor.guard';
import { MentorNotificationComponent } from './mentor/mentornotification.component';
import { PaymentMentorComponent } from './payment/paymentmentor.component';


const routes: Routes = [
  { path: '', pathMatch: 'full', component:LoginComponent },
  { path: 'users', component: UserComponent, canActivate: [AuthGuard] },
  { path: 'adduser', component: AddUserComponent },
  { path: 'addmentor', component: AddMentorComponent },
  { path: 'mentor', component: MentorComponent,canActivate: [AuthGuardMentor] },
  { path: 'trainings', component: TrainingsComponent },
  { path: 'technologies', component: TechnologiesComponent },
  { path: 'payment', component: PaymentComponent },
  { path: 'addpayment', component: AddPaymentComponent },
  { path: 'addskill', component: AddSkillComponent },
  { path: 'skill', component: SkillComponent },
  { path: 'addtrainings', component: AddTrainingsComponent },
  { path: 'addtechnologies', component: AddTechnologiesComponent },
  { path: 'userlogin', component: UserLoginComponent},
  { path: 'mentorlogin', component: MentorLoginComponent},
  { path: 'mentoradmin', component: MentorAdminComponent},
  { path: 'admin', component: AdminComponent},
  { path: 'useradmin', component: UserAdminComponent},
  { path: 'usersignup', component: UserSignupComponent},
  { path: 'mentorsignup', component: MentorSignupComponent},
  { path: 'mentorsearch', component: MentorSearchComponent},
  { path: 'mentorresults', component: MentorResultsComponent},
  { path: 'userprofile', component: UserProfileComponent},
  { path: 'usernotification', component:UserNotificationComponent},
  { path: 'adminlogin', component:AdminLoginComponent},
  { path: 'mentorprofile', component:MentorProfileComponent},
  { path: 'mentoruser', component:MentorUserComponent},
  { path: 'mentornotification', component:MentorNotificationComponent},
  { path: 'mentorpayment', component:PaymentMentorComponent}
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  providers: [AuthGuard,AuthGuardMentor],
  declarations: []
})
export class AppRoutingModule { }
