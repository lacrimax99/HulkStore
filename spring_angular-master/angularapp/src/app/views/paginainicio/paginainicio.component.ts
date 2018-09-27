import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-paginainicio',
  templateUrl: './paginainicio.component.html',
  styleUrls: ['./paginainicio.component.css']
})
export class PaginainicioComponent implements OnInit {

  title = 'Super Heroes Marvel';
  logo = "../assets/images/logo.png";

  constructor() { }

  ngOnInit() {
  }

}
