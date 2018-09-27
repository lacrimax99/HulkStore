import {Producto} from '../../model/producto';
import {ProductoService} from '../../providers/producto.service';
import {Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  private productos$: Observable<Producto[]>;

  constructor(private productoService: ProductoService) {}

  ngOnInit() {
    this.productos$ = this.productoService.getProductos();
  }

  count() {
    return this.productoService.countSeleccionados();
  }


}
