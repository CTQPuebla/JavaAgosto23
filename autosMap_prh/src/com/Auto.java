package com;

public class Auto {
	
	String marca;
	String modelo;
	int a�o;
	double precio;
	String placa;
	
	
	
	public Auto() {
		
	}


	public Auto(String marca, String modelo, int a�o, double precio, String placa) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = a�o;
		this.precio = precio;
		this.placa = placa;
		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
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


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", a�o=" + a�o + ", precio=" + precio + ", placa="
				+ placa + "]";
	}


	

}
