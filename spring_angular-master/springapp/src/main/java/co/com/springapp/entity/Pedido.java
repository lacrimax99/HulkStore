package co.com.springapp.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2228106335093009466L;

	String codigo;
	
	double totalCostoPedido;
	
	private ArrayList<ItemPedido> listaItemPedido;
	
	public Pedido() {
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getTotalCostoPedido() {
		return totalCostoPedido;
	}

	public void setTotalCostoPedido(double totalCostoPedido) {
		this.totalCostoPedido = totalCostoPedido;
	}

	public ArrayList<ItemPedido> getListaItemPedido() {
		return listaItemPedido;
	}

	public void setListaItemPedido(ArrayList<ItemPedido> listaItemPedido) {
		this.listaItemPedido = listaItemPedido;
	}

	

}
