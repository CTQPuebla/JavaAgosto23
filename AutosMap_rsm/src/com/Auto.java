package com;

public class Auto {

	String modelo;
	int a�o;
	double precio;
	String placas;
	
	public Auto(String modelo, int a�o, double precio, String placas) {
		super();
		this.modelo = modelo;
		this.a�o = a�o;
		this.precio = precio;
		this.placas = placas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
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
		return "Auto [modelo=" + modelo + ", a�o=" + a�o + ", precio=" + precio + ", placas=" + placas + "]";
	}
	
	
}
