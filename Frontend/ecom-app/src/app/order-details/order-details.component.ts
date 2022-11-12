import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css']
})
export class OrderDetailsComponent implements OnInit {
  orderDetailsURL : any;
  orderDetails:any;
  orderId!:number;
  constructor(private http:HttpClient, private router:Router, private route:ActivatedRoute) {
    this.orderId = route.snapshot.params['orderId']
    this.orderDetailsURL = "http://localhost:9999/order-service/fullOrder/"+this.orderId;
  }

  ngOnInit(): void {
    this.http.get(this.orderDetailsURL).subscribe({
      next : (data)=>{
        this.orderDetails = data
      },
      error : err => {}
    })
  }

}
