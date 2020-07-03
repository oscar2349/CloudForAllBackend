package com.CloudForAll.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

import com.CloudForAll.Entity.Productos;
import com.CloudForAll.services.Iproductos;

//@Controller
@RequestMapping("cloudforall")
public class ProductosController {

	@Autowired
	private Iproductos productos;

	@GetMapping("/productos")
	public String listar(Model model) {
		model.addAttribute("titulo", "listado");
		model.addAttribute("productos", productos.findAll());
		return "productos";
	}

	@GetMapping("/form")
	public String formulario(Map<String, Object> model) {
		Productos producto = new Productos();
		model.put("productos", producto);
		model.put("titulo", "Formulario");
		return "form";
	}

	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {

		if (id > 0) {
			productos.delete(id);
		}
		return "redirect:../productos";
	}

	@PostMapping(value = "/form")
	public String buscar(Productos producto,Map<String, Object> model) {
		model.put("titulo", "producto");
		//model.put("productos", productos.findOne((producto.getIdProducto().longValue())));
		
		List<Productos> ListaProductos = productos.findByidProductoAndcantidadProducto(producto.getIdProducto(), producto.getCantidadProducto());
		System.out.println(ListaProductos.size());
		model.put("productos", ListaProductos);
		return "productos";
	}
	

}
