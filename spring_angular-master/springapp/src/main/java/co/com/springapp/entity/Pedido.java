package co.com.springapp.entity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que representa un pedido.
 * @author fbedoya
 */
public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2228106335093009466L;

	/**
	 * Código del pedido.
	 */
	String codigo;
	
	/**
	 * Total costo del pedido.
	 */
	double totalCostoPedido;
	
	/**
	 * Lista con los items del pedido.
	 */
	private ArrayList<ItemPedido> listaItemPedido;
	
	public Pedido() {
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the totalCostoPedido
	 */
	public double getTotalCostoPedido() {
		return totalCostoPedido;
	}

	/**
	 * @param totalCostoPedido the totalCostoPedido to set
	 */
	public void setTotalCostoPedido(double totalCostoPedido) {
		this.totalCostoPedido = totalCostoPedido;
	}

	/**
	 * @return the listaItemPedido
	 */
	public ArrayList<ItemPedido> getListaItemPedido() {
		return listaItemPedido;
	}

	/**
	 * @param listaItemPedido the listaItemPedido to set
	 */
	public void setListaItemPedido(ArrayList<ItemPedido> listaItemPedido) {
		this.listaItemPedido = listaItemPedido;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
