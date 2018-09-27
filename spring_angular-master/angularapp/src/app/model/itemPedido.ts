import { Producto } from "./producto";

export class ItemPedido {

    private producto : Producto;
    private cantidadPedida : number;



	constructor($producto: Producto, $cantidadPedida: number) {
        this.producto = $producto;
        this.cantidadPedida = $cantidadPedida;
	}


    /**
     * Getter $producto
     * @return {Producto}
     */
	public get $producto(): Producto {
		return this.producto;
	}

    /**
     * Getter $cantidadPedida
     * @return {number}
     */
	public get $cantidadPedida(): number {
		return this.cantidadPedida;
	}

    /**
     * Setter $producto
     * @param {Producto} value
     */
	public set $producto(value: Producto) {
		this.producto = value;
	}

    /**
     * Setter $cantidadPedida
     * @param {number} value
     */
	public set $cantidadPedida(value: number) {
		this.cantidadPedida = value;
	}
    
}