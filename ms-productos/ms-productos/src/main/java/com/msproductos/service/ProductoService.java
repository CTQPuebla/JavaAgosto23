package com.msproductos.service;

import java.util.List;

import com.msproductos.Exception.BuscarException;

import com.msproductos.Exception.ResourceNotFoundException;
import com.msproductos.Exception.RefrigeradoException;
import com.msproductos.entity.Productos;
import com.msproductos.request.ProductoRequest;

public interface ProductoService {

	//Operaciones que el micro servicio va realizar en esta capa
	
	Productos guardar (ProductoRequest request) throws ResourceNotFoundException, RefrigeradoException;
	Productos actualizar (ProductoRequest request); 
	Productos buscar (int id);
	Productos buscar (String nombre);
	String eliminar (int id);
	List mostrar() throws BuscarException;
}
