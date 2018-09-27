import { Type } from '@angular/core';

/**
 * Clase del Producto.
 **/
export class Producto {
  codigo: string;
  descripcion: string;
  categoria: string;
  precio: number;
  stock: number;
  imageUrl?: string;
  imageUrl2?: string;
  seleccionado: boolean;
	
  constructor() {}
}
