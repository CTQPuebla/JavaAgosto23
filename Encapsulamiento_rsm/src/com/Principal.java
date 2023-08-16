package com;

public class Principal {
	public static void main(String[] args) {
		Modelo m= new Modelo();
		//Forma de acceder a una variable private o protected
		m.setX(10);
		m.getX();
		
		m.mensaje="hola";
		System.out.print(m.mensaje);
		
		m.decimal=50.63;
		//accceder a las propiedades por get, set
	}
}
