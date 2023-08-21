package com;

public class Autos {

	String modelo;
	int año;
	double precio;
	String placas;
	String marca;
	public Autos() {
		
	}

	public Autos(String modelo, int año, double precio, String placas, String marca) {
		
		this.modelo = modelo;
		this.año = año;
		this.precio = precio;
		this.placas = placas;
		this.marca = marca;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Autos [modelo=" + modelo + ", año=" + año + ", precio=" + precio + ", placas=" + placas + ", marca="
				+ marca + "]";
	}

	
	
	
	
}
