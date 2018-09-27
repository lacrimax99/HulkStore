import { Injectable } from '@angular/core';
import { Pedido } from '../model/pedido';

@Injectable()
export class DataService {
  pedido: Pedido;
}
