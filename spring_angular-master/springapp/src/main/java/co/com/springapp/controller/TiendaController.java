package co.com.springapp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.springapp.CargarDatos;
import co.com.springapp.entity.Pedido;
import co.com.springapp.entity.PedidoResponse;
import co.com.springapp.entity.Producto;
import co.com.springapp.interfaces.IPedidoService;

/** 
 * Clase controladora.
 * @author lenovo
 */
@RestController
@RequestMapping("/tienda")
@CrossOrigin(origins = "*")
public class TiendaController {
	
	/** Instancia del servicio de pedido. */
	@Autowired
	private IPedidoService pedidoService;

	@RequestMapping(value = "/productos")
	public List<Producto> consultarProductos() {
		HashMap<String, Producto> mapaProductos = CargarDatos.getProductos();
		 List<Producto> listProductos = new ArrayList<>();
		 mapaProductos.forEach((k,v)-> listProductos.add(v));
		 return listProductos;
	}
	
	@RequestMapping(value = "/crearPedido", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<PedidoResponse> realizarPedido(@RequestBody Pedido pedido) {
		return new ResponseEntity<>(pedidoService.almacenarPedido(pedido), HttpStatus.OK);
	}
	
	
}
