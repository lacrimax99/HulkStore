import { Producto } from '../../model/producto';
import { ProductoService } from '../../providers/producto.service';
import { Component, OnInit, ChangeDetectionStrategy, EventEmitter } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { ItemPedido } from '../../model/itemPedido';
import { DataService } from '../../providers/data.service';
import { Pedido } from '../../model/pedido';

@Component({
  selector: 'app-catalogo',
  templateUrl: './catalogo.component.html',
  styleUrls: ['./catalogo.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class CatalogoComponent implements OnInit {

  public model : Pedido;

  constructor(private productoService: ProductoService, private dataService: DataService) { }

  public listaItemsPedido = Array<ItemPedido>();
  ngOnInit() {
    this.model = new Pedido(0, new Array<ItemPedido>());
  }

  getProductos() {
    return this.productoService.getProductos();

  }

  agregarProducto(event): void {
    let producto: Producto;
    producto = event;
    var item = new ItemPedido(producto, 1);
    if (producto.seleccionado) {
      this.listaItemsPedido.push(item);
    } else {
      this.listaItemsPedido = this.listaItemsPedido.filter(obj => obj.$producto !== producto);
    }
    this.model.$listaItemPedido = this.listaItemsPedido;
    this.asignarItemPedido(this.model)
  }

  asignarItemPedido(pedidoActual: Pedido) {
    this.dataService.pedido = pedidoActual;
  }

}
