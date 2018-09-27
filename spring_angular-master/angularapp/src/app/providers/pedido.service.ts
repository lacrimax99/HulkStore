import {environment} from '../../environments/environment';
import {Injectable} from '@angular/core';
import { Pedido } from '../model/pedido';
import { Http, Response, Headers } from '@angular/http';



@Injectable()
export class PedidoService {
  private urlbase = environment.urlbasePedido;
  private urlPedido = 'crearPedido';

  constructor(private http: Http) {}

  public guardarPedido(pedido: Pedido) {
    const json = JSON.stringify(pedido);
    const params = json;
    const headers = new Headers({ 'Content-Type': 'application/json'});
    return this.http.post(this.urlbase + this.urlPedido, params, { headers: headers })
    .map(res => res.json());
}

}
