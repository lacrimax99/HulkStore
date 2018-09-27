package co.com.springapp.service;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import co.com.springapp.CargarDatos;
import co.com.springapp.entity.ItemPedido;
import co.com.springapp.entity.Pedido;
import co.com.springapp.entity.Producto;

/**
 * Pedido Service unit test.
 * @author lenovo
 *
 */
public class PedidoServiceTest {
	
	HashMap<String, Producto> mapaProductos; 
	@Before
	public void beforeTest() {
		mapaProductos = CargarDatos.getProductos();
	}

	@Test
	public void testActualizarStockProducto() {
		Producto producto1 = mapaProductos.get("0001");
		Producto producto2 = mapaProductos.get("0002");
		Pedido pedido = cargarPedido(producto1, producto2);
		//
		double stockProducto1AntesPedido = producto1.getStock();
		double stockProducto2AntesPedido = producto2.getStock();
		PedidoService pedidoService = new PedidoService();
		pedidoService.almacenarPedido(pedido);
		for (ItemPedido ip : pedido.getListaItemPedido()) {
			if (ip.getProducto().getCodigo().equals(producto1.getCodigo())) {
				assertTrue(producto1.getStock() == stockProducto1AntesPedido - ip.getCantidadPedida());
			} else {
				assertTrue(producto2.getStock() == stockProducto2AntesPedido - ip.getCantidadPedida());
			}
		}
	}
	
	/**
	 * Carga el pedido en memoria.
	 * @param producto1
	 * @param producto2
	 * @return
	 */
	private Pedido cargarPedido(Producto producto1,Producto producto2) {
		// Crear pedido.
		Pedido pedido = new Pedido();
		double totalCosto = producto1.getPrecio() + producto2.getPrecio();
		pedido.setCodigo("1");
		pedido.setTotalCostoPedido(totalCosto);
		// Crear Items Pedido 1.
		ItemPedido itemPedido1 = new ItemPedido();
		itemPedido1.setProducto(producto1);
		itemPedido1.setCantidadPedida(1);
		// Crear Items Pedido 2.
		ItemPedido itemPedido2 = new ItemPedido();
		itemPedido2.setProducto(producto2);
		itemPedido2.setCantidadPedida(1);
		// Adicionar items a pedido.
		ArrayList<ItemPedido> listItemPedido = new ArrayList<>();
		listItemPedido.add(itemPedido1);
		listItemPedido.add(itemPedido2);
		pedido.setListaItemPedido(listItemPedido);
		return pedido;
	}
	

}
