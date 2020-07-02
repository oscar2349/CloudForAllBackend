package com.CloudForAll.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.CloudForAll.Entity.Productos;

public interface IProductosDao extends CrudRepository<Productos, Long>{
	
	List<Productos> findByidProductoAndcantidadProductoAndidPreventa(String idProducto, String cantidadProducto,String idPreventa);

}
