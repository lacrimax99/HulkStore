import {Producto} from './model/producto';
import {ProductoService} from './providers/producto.service';
import {Component, ChangeDetectionStrategy, OnInit} from '@angular/core';
import {Observable} from 'rxjs/Observable';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class AppComponent implements OnInit {
  title = 'Imperio Catálogo de Hombres';
  private productos$: Observable<Producto[]>;
  
  constructor(private productoService: ProductoService) {}
  ngOnInit() {
    this.productoService.loadData();
  }
}
