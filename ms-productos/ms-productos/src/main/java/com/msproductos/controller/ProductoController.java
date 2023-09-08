package com.msproductos.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msproductos.Exception.BuscarException;
import com.msproductos.Exception.IdNotFoundException;
import com.msproductos.Exception.ResourceNotFoundException;
import com.msproductos.entity.Productos;
import com.msproductos.impl.ProductoImplement;
import com.msproductos.request.ProductoRequest;

@RestController
@RequestMapping("Productos/")
public class ProductoController {

	
	@Autowired 
    ProductoImplement logic;

	@PostMapping
	ResponseEntity<Productos> guardar(@Valid @RequestBody ProductoRequest request) {
		Productos prod = logic.guardar(request);
		return new ResponseEntity<Productos>(prod, HttpStatus.OK);
	}

	@PutMapping
	ResponseEntity<Productos> actualizar(@RequestBody ProductoRequest request) {
		Productos prod = logic.actualizar(request);
		return new ResponseEntity<Productos>(prod, HttpStatus.OK);
	}

	@GetMapping
	ResponseEntity <List<Productos>> mostrar() {
		List<Productos> prod = logic.mostrar();
		return new ResponseEntity<List<Productos>>(prod, HttpStatus.OK);
		//return new ResponseEntity<List<Productos>>(prod, HttpStatus.OK);
		
	}

	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Productos> buscar(@PathVariable int id) {
		Productos prod = logic.buscar(id);
		return new ResponseEntity<Productos>(prod, HttpStatus.OK);
	}

	@DeleteMapping("eliminar-por-id/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id) {
		String mensaje = logic.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}

}
