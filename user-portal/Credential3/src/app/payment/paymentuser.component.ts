import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Payment } from '../models/payment.model';
import { PaymentService } from './payment.service';

@Component({
  selector: 'app-paymentuser',
  templateUrl: './paymentuser.component.html',
  styles: []
})
export class PaymentUserComponent implements OnInit {

  payments: Payment[];


  constructor(private router: Router, private paymentService: PaymentService) {

  }

  ngOnInit() {
    this.paymentService.getPayments()
      .subscribe( data => {
        this.payments = data;
      });
  };

  

  deleteUser(payment: Payment): void {
    this.paymentService.deletePayment(payment)
      .subscribe( data => {
        this.payments = this.payments.filter(u => u !== payment);
      })
  };

}


