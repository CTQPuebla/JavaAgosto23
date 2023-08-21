package com;

public class Auto {

	String modelo;
	int año;
	double precio;
	String placas;
	
	public Auto(String modelo, int año, double precio, String placas) {
		super();
		this.modelo = modelo;
		this.año = año;
		this.precio = precio;
		this.placas = placas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getPlacas() {
		return placas;
	}
	public void setPlacas(String placas) {
		this.placas = placas;
	}
	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", año=" + año + ", precio=" + precio + ", placas=" + placas + "]";
	}
	
	
}
