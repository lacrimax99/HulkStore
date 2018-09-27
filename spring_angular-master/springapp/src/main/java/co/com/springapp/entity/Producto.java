package co.com.springapp.entity;

import java.io.Serializable;

public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2505298275117259266L;

	/**
	 * Código del producto.
	 */
	String codigo;

	/**
	 * Descripción del producto.
	 */
	String descripcion;
	
	/**
	 * categoria del producto.
	 */
	String categoria;
	
	/**
	 * precio del producto.
	 */
	double precio;
	
	/**
	 * Cantidad disponible del producto.
	 */
	double stock;
	
	/**
	 * Url de la imagen del producto.
	 */
	String imageUrl;
	
	/**
	 * Url 2 de la imagen del producto.
	 */
	String imageUrl2;
	
	/**
	 * Valida si el producto esta seleccionado.
	 */
	boolean seleccionado;
	
	public Producto() {
	}

	/**
	 * Constructor por defecto.
	 * @param codigo .
	 * @param descripcion .
	 */
	public Producto(String codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	
	/**
	 * Constructor por defecto.
	 * @param codigo .
	 * @param descripcion .
	 * @param categoria .
	 * @param precio .
	 * @param imageUrl .
	 * @param imageUrl2 .
	 */
	public Producto(String codigo, String descripcion, String categoria, double precio, double stock, String imageUrl,
			String imageUrl2) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
		this.imageUrl = imageUrl;
		this.imageUrl2 = imageUrl2;
	}



	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *            the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the stock
	 */
	public double getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(double stock) {
		this.stock = stock;
	}

	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the imageUrl2
	 */
	public String getImageUrl2() {
		return imageUrl2;
	}

	/**
	 * @param imageUrl2 the imageUrl2 to set
	 */
	public void setImageUrl2(String imageUrl2) {
		this.imageUrl2 = imageUrl2;
	}

	public boolean isSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(boolean seleccionado) {
		this.seleccionado = seleccionado;
	}
	
	

}
