import {Producto} from '../../model/producto';
import { ProductoService } from '../../providers/producto.service';
import {Component, OnInit, Input, HostListener, Output, EventEmitter} from '@angular/core';
import { Pedido } from '../../model/pedido';
import { ItemPedido } from '../../model/itemPedido';

@Component({
  selector: 'app-producto',
  templateUrl: './producto.component.html',
  styleUrls: ['./producto.component.css']
})
export class ProductoComponent implements OnInit {

  @Input() producto: Producto;

  @Output() agregarItem = new EventEmitter();

  imageUrl: string;

  private model : Pedido;

  constructor(private productoService: ProductoService) {}

  ngOnInit() {
    this.imageUrl = this.producto.imageUrl;
    //this.model = new Pedido(0 , new Array<ItemPedido>());
  }

  @HostListener('mouseover') onMouseOver() {
    this.imageUrl = this.producto.imageUrl2;
  }

  @HostListener('mouseout') onMouseOut() {
    this.imageUrl = this.producto.imageUrl;
  }

  onSeleccionar() {
    /*if (this.producto.stock == 0) {
    alert('No hay cantidad disponible');
    return;
    }*/
    if (this.producto.seleccionado) {
      this.producto.seleccionado = false;
      this.agregarItem.emit(this.producto)
    } else {
      this.producto.seleccionado = true;
      this.agregarItem.emit(this.producto)
    };
  }


}
