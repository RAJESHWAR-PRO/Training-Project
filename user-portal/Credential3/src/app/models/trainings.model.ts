import { Mentor } from './mentor.model';
import { Technologies } from './technologies.model';
import { User } from './user.model';

export class Trainings {

  id: number;
  status: string;
  progress: number;
  commissionAmount:number;
  rating:number;
  startDate:Date;
  endDate:Date;
  startTime:string;
  endTime:string;
  amountReceived:number;
  userId:BigInteger;
  userName:String;
  mentorId:number;
  users:User[];
  // technology:Technologies;
  // skill:Skill[];
  // payment:payment[]

  mentorName:string;
  skillId:BigInteger;
  skillName:string;
  fees:number;
  razorpayPaymentId:String;
  mentor:Mentor;
  technologies:Technologies;
}
