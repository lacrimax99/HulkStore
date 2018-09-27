import { environment } from '../../../environments/environment';
import {Producto} from '../../model/producto';
import {ProductoService} from '../../providers/producto.service';
import {Component, OnInit} from '@angular/core';
import {FormBuilder, Validators} from '@angular/forms';
import {Observable} from 'rxjs/Observable';

import 'rxjs/add/operator/map';
import { Pedido } from '../../model/pedido';
import { DataService } from '../../providers/data.service';
import { Router } from '@angular/router';
import { PedidoService } from '../../providers/pedido.service';

@Component({
  selector: 'app-pedido',
  templateUrl: './pedido.component.html',
  styleUrls: ['./pedido.component.css']
})
export class PedidoComponent implements OnInit {

  title = 'Diligencie su Pedido';
  logo = require('../../../assets/images/logo.png');
  //environment.baseUrlAssets + 'images/logo.png';
  private productos$: Observable<Producto[]>;

  public model : Pedido;

  profileForm = this.fb.group({
    nombres: ['', Validators.required],
    apellidos: ['', Validators.required],
    tipoDocumento: ['', Validators.required],
    identificacion: ['', Validators.required],
    direccion: ['', Validators.required],
    fecha: ['', Validators.required]
  });

  constructor(private productoService: ProductoService, private fb: FormBuilder, private dataService: DataService, private router: Router, 
              private pedidoService: PedidoService) {}

  ngOnInit() {
    this.productos$ = this.productoService.getProductos();
    this.model = this.dataService.pedido;

  }

  getProductosSeleccionados() {
    return this.productoService.getProductosSeleccionados();
  }

  count() {
    return this.productoService.countSeleccionados();
  }

  suma() {
    return this.productoService.precioTotalProductosSeleccionados();
  }

  finalizarPedido(): void {
    this.pedidoService.guardarPedido(this.model)
      .subscribe(
        result => {
          this.productoService.loadData();
          this.router.navigate(['']);
        },
        error => {
          this.router.navigate(['']);
        }
      );
    this.productoService.loadData();
        this.router.navigate(['']);

  }

}
