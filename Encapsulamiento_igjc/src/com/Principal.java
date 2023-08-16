package com;

public class Principal {

	public static void main(String[] args) {
		
		Modelo m = new Modelo();
		
		m.setX(20);//forma correcta  de acceder a la forma correcta de acceder ( privada
		m.getX();
		
		m.mensaje="hola";
		System.out.println(m.mensaje);
		m.doSomething();
		
		
		
		
		
		
	}

}
