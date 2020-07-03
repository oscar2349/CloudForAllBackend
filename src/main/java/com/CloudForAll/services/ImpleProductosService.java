package com.CloudForAll.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.CloudForAll.DAO.IProductosDao;
import com.CloudForAll.Entity.Productos;

@Service
public class ImpleProductosService implements Iproductos {

	@Autowired
	private IProductosDao productos;

	@Override
	public List<Productos> findAll() {
		return (List<Productos>) productos.findAll();
	}

	@Override
	@Transactional
	public void save(Productos producto) {
		productos.save(producto);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		productos.deleteById(id);

	}

	@Override
	public Productos findOne(Long id) {
		
		return productos.findById(id).orElse(null);
	}

	@Override
	public List<Productos> findByidProductoAndcantidadProducto(Long idProducto, int cantidadProducto) {
		return productos.findByIdProductoAndCantidadProducto(idProducto, cantidadProducto);
		 
	}

}
