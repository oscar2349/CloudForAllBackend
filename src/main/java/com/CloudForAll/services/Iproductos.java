package com.CloudForAll.services;

import java.util.List;

import com.CloudForAll.Entity.Productos;


public interface Iproductos {

	public List<Productos> findAll();

	public void save(Productos producto);

	public Productos findOne(Long id);

	public void delete(Long id);
	
	public List<Productos> findByidProductoAndcantidadProducto(Long idProducto, int cantidadProducto);

}
