package co.com.springapp.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import co.com.springapp.CargarDatos;
import co.com.springapp.entity.Pedido;
import co.com.springapp.entity.ItemPedido;
import co.com.springapp.entity.PedidoResponse;
import co.com.springapp.entity.Producto;
import co.com.springapp.interfaces.IPedidoService;

@Service
public class PedidoService implements IPedidoService {

	
	@Override
	public PedidoResponse almacenarPedido(Pedido pedido) {
		PedidoResponse response = new PedidoResponse();
		//
		CargarDatos.getMapaPedidos().put(pedido.getCodigo(), pedido);
		boolean pedidoDisponible = true;
		HashMap<String, ItemPedido> mapaPedidosProducto = CargarDatos.getMapaPedidosProducto();
		HashMap<String, Producto> mapaProductos = CargarDatos.getProductos();
		
		for (ItemPedido itemPedido : pedido.getListaItemPedido()) {
			mapaPedidosProducto.put(pedido.getCodigo() + itemPedido.getProducto().getCodigo(), itemPedido);
			Producto producto = mapaProductos.get(itemPedido.getProducto().getCodigo());
			if (itemPedido.getCantidadPedida() > producto.getStock()) {
				pedidoDisponible = false;
				response.setMsg(response.getMsg()  + " El producto " + producto.getCodigo() + " no cuenta con cantidad "
						+ itemPedido.getCantidadPedida() + " disponible para el pedido");
				continue;
			}
			producto.setStock(producto.getStock() - itemPedido.getCantidadPedida());
		}
		response.setSuccess(pedidoDisponible);
		return response;
	}

}
