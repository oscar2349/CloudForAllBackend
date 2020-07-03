package com.CloudForAll.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import com.CloudForAll.Entity.Productos;
import com.CloudForAll.services.Iproductos;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("cloudforall")
public class ProductosRestController {

	@Autowired
	private Iproductos productos;

	@GetMapping("/productos")
	public List<Productos> listar() {
		
		return productos.findAll();
	}

	@GetMapping("/form")
	public Productos formulario() {
		Productos producto = new Productos();
		
		return producto;
	}

	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {

		if (id > 0) {
			productos.delete(id);
		}
		return "redirect:../productos";
	}

	@PostMapping(value = "/form")
	public List<Productos> buscar(Productos producto) {
		List<Productos> ListaProductos = productos.findByidProductoAndcantidadProducto(producto.getIdProducto(), producto.getCantidadProducto());
		return ListaProductos;
	}
	

}
