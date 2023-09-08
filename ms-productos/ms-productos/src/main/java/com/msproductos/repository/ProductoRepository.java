package com.msproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Productos;
/*
JpaRepository<Productos,Integer><entidad,tipo de dato llave primaria entidad>
*/
@Repository
public interface ProductoRepository extends JpaRepository<Productos,Integer>{

	
	
}
