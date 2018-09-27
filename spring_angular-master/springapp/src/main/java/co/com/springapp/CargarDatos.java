package co.com.springapp;

import java.util.HashMap;

import co.com.springapp.entity.Pedido;
import co.com.springapp.entity.ItemPedido;
import co.com.springapp.entity.Producto;

/**
 * Clase encargada de hacer la carga de datos a nivel de la aplicación
 * @author fbedoya
 *
 */
public class CargarDatos {
	
	/**
	 * Mapa de productos de la tienda.
	 */
	private static HashMap<String, Producto> mapaproductos = new HashMap<>();
	
	/**
	 * Mapá de pedidos.
	 */
	private static HashMap<String, Pedido> mapaPedidos = new HashMap<>();
	
	/**
	 * Mapá de pedidos con los productos asignados en la compra.
	 */
	private static HashMap<String, ItemPedido> mapaPedidosProducto = new HashMap<>();
		
	/**
	 * Carga los datos iniciales de productos.
	 * @return Mapa de producto donde la clave es el código y el producto el valor.
	 */
	public static HashMap<String, Producto> getProductos(){
		if (mapaproductos.isEmpty()) {
			cargarProductos();
		}
		return mapaproductos;
	}

	private static void cargarProductos() {
		Producto producto1 = new Producto("0001", "Estilo nuevo en tendencia.", "Camisa Capitan America", 25000, 10,
				"../assets/images/todo1/0001-A.jpg", "../assets/images/todo1/0001-B.jpg");
		Producto producto2 = new Producto("0002", "Estilo nuevo en tendencia.", "Camisa Thor", 30000, 15,
				"../assets/images/todo1/0002-A.jpg", "../assets/images/todo1/0002-B.jpg");
		Producto producto3 = new Producto("0003", "Estilo nuevo en tendencia.", "Camisa Linterna Verde", 35000, 20,
				"../assets/images/todo1/0003-A.jpg", "../assets/images/todo1/0003-B.jpg");
		Producto producto4 = new Producto("0004", "Estilo nuevo en tendencia.", "Camisa Hombre Araña", 40000, 25,
				"../assets/images/todo1/0004-A.jpg", "../assets/images/todo1/0004-B.jpg");
		Producto producto5 = new Producto("0005", "Estilo nuevo en tendencia.", "Camisa Holk", 40000, 5,
				"../assets/images/todo1/0005-A.jpg", "../assets/images/todo1/0005-B.jpg");
		mapaproductos.put("0001", producto1);
		mapaproductos.put("0002", producto2);
		mapaproductos.put("0003", producto3);
		mapaproductos.put("0004", producto4);
		mapaproductos.put("0005", producto5);
	}

	/**
	 * @return the mapaPedidos
	 */
	public static HashMap<String, Pedido> getMapaPedidos() {
		return mapaPedidos;
	}

	/**
	 * @param mapaPedidos the mapaPedidos to set
	 */
	public static void setMapaPedidos(HashMap<String, Pedido> mapaPedidos) {
		CargarDatos.mapaPedidos = mapaPedidos;
	}

	public static HashMap<String, Producto> getMapaproductos() {
		return mapaproductos;
	}

	public static void setMapaproductos(HashMap<String, Producto> mapaproductos) {
		CargarDatos.mapaproductos = mapaproductos;
	}

	public static HashMap<String, ItemPedido> getMapaPedidosProducto() {
		return mapaPedidosProducto;
	}

	public static void setMapaPedidosProducto(HashMap<String, ItemPedido> mapaPedidosProducto) {
		CargarDatos.mapaPedidosProducto = mapaPedidosProducto;
	}

}
