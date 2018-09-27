package co.com.springapp.interfaces;

import co.com.springapp.entity.Pedido;
import co.com.springapp.entity.PedidoResponse;

public interface IPedidoService {
	
	PedidoResponse almacenarPedido(Pedido pedido);
	
}
