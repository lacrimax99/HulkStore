package co.com.springapp.entity;

import java.io.Serializable;

/**
 * Clase que representa un item del pedido.
 * @author fbedoya
 */
public class ItemPedido implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7199227817320919592L;

	double cantidadPedida;

	Producto producto;
	
	public ItemPedido() {
	}

	public double getCantidadPedida() {
		return cantidadPedida;
	}

	public void setCantidadPedida(double cantidadPedida) {
		this.cantidadPedida = cantidadPedida;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
}
