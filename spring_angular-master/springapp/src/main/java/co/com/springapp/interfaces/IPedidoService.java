package co.com.springapp.interfaces;

import co.com.springapp.entity.Pedido;
import co.com.springapp.entity.PedidoResponse;

/**
 * * Interface que se encarga de definir los métodos del servico de Pedido.
 * @author fbedoya
 */
public interface IPedidoService {
	
	PedidoResponse almacenarPedido(Pedido pedido);
	
}
