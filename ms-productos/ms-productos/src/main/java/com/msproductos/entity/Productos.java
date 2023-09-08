package com.msproductos.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTOS")
public class Productos implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="prodAuto")
	@SequenceGenerator(name="prodAuto", sequenceName="SQ_PRODUCTOS", allocationSize=1)
	@Column(name="PRODUCTO_ID",columnDefinition="NUMBER")
	private int producto_Id;
	@Column(name="DEPTO_ID",columnDefinition="NUMBER")
	private int depto_Id;
	@Column(name="NOMBRE",columnDefinition="NVARCHAR2(20)")
	private String nombre;
	@Column(name="FECHA_CAD",columnDefinition="DATE")
	private LocalDateTime fechaCad;
	@Column(name="PRECIO_COMPRA",columnDefinition="NUMBER(5,2)")
	private double precioCompra;
	@Column(name="PRECIO_VENTA",columnDefinition="NUMBER(5,2)")
	private double precioVenta;
	@Column(name="REFRIGERADO",columnDefinition="CHAR(1)")
	
	private char refrigerado ;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
		
	
	
}
