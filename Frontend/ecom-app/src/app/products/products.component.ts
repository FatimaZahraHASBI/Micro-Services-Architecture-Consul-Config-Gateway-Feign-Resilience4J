import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  productsURL = "http://localhost:9999/inventory-service/products?projection=fullProduct";
  products:any;

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    this.http.get(this.productsURL).subscribe({
      next : (data)=>{
        this.products = data
      },
      error : err => {}
    })
  }

}
