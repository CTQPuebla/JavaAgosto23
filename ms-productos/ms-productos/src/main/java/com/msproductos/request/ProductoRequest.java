package com.msproductos.request;
import java.time.LocalDateTime;

import javax.validation.constraints.*;
//import javax.validation.constraints.


public class ProductoRequest {

	/*Inicialmente no lleva notaciones, 
	 * si lleva atributos constructoes get and set
	*/
	
	private int producto_Id; 
	private int depto_Id;
	@NotBlank(message="No puede ir vacio el nmbre")
	private String nombre;
	@Future(message="la fecha de caducidad Debe er mayor a la fecha actual")
	private LocalDateTime fechaCad;
	@Digits(integer=3,fraction=2)
	private double precioCompra;
	
	@Digits(integer=3,fraction=2)
	private double precioVenta;
	
	private char refrigerado;

	public int getProducto_Id() {
		return producto_Id;
	}

	public void setProducto_Id(int producto_Id) {
		this.producto_Id = producto_Id;
	}

	public int getDepto_Id() {
		return depto_Id;
	}

	public void setDepto_Id(int depto_Id) {
		this.depto_Id = depto_Id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(LocalDateTime fechaCad) {
		this.fechaCad = fechaCad;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public char getRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(char refrigerado) {
		this.refrigerado = refrigerado;
	}
	
	
	
	
}
	