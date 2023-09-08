package com.msproductos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.Exception.BuscarException;
import com.msproductos.Exception.RefrigeradoException;
import com.msproductos.Exception.ResourceNotFoundException;
import com.msproductos.entity.Productos;
import com.msproductos.repository.DepartamentoRepository;
import com.msproductos.repository.ProductoRepository;
import com.msproductos.request.ProductoRequest;
import com.msproductos.service.ProductoService;

@Service
public class ProductoImplement implements ProductoService {

	// Inyeccion de dependencias
	@Autowired
	ProductoRepository repo;

	@Autowired
	DepartamentoRepository drepo;

	@Override
	public Productos guardar(ProductoRequest request) {
		Productos p = new Productos();

		if (!drepo.findById(request.getDepto_Id()).isPresent()) {
			//System.out.println("No existe");
			throw new BuscarException("Departamento no existe");
		} else if (!(request.getRefrigerado()=='0' || request.getRefrigerado()=='1')) {
			//System.out.println("Para regrigerado solo puede ser 0 y 1");
			throw new RefrigeradoException("Debes ingresa 0 ref y 1");
		} else {

			p.setNombre(request.getNombre());
			p.setDepto_Id(request.getDepto_Id());
			p.setFechaCad(request.getFechaCad());
			p.setPrecioCompra(request.getPrecioCompra());
			p.setPrecioVenta(request.getPrecioVenta());
			p.setRefrigerado(request.getRefrigerado());
			repo.save(p);

		}
		return p;
	}

	@Override
	public Productos actualizar(ProductoRequest request) {

		Productos p = repo.findById(request.getProducto_Id()).get();
		p.setNombre(request.getNombre());
		p.setDepto_Id(request.getDepto_Id());
		p.setFechaCad(request.getFechaCad());
		p.setPrecioCompra(request.getPrecioCompra());
		p.setPrecioVenta(request.getPrecioVenta());
		p.setRefrigerado(request.getRefrigerado());

		repo.save(p);
		return p;
	}

	@Override
	public Productos buscar(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public Productos buscar(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
