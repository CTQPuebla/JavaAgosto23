package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Modelo m = new Modelo();
		
		//m.x =20; no se puede acceder por se privado
		m.setX(20);//forma correcta de acceder 
		m.getX();//atributo private, con los getters y setters
		
		m.mensaje= "hola";
		
		System.out.println(m.mensaje);
		m.doSomething();
		m.decimal = 30.50;
		//la forma correcta de acceder a cualquier atributo es usando los getters y setters

		

	}

}
