package com;

public class Principal {
	public static void main(String[] args) {
		
		Modelo m = new Modelo();
		
		m.setX(20);  //forma correcta de acceder al
		m.getX();    //atributo private, con los getter
						// Y setters
		
		
		
		m.mensaje="hola";
		System.out.println(m.mensaje);
		m.doSometing();
		
		m.decimal = 30.50;
		
		
		
		
	}

}
