package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Modelo m= new Modelo();
		
		//m.x=20; acceso incorrecto por ser privado
		
		
		m.setX(20);;//forma correcta de acceder
		m.getX();    //atributo private, con lod getter
		//y setters
		
		
		m.mesaje="HOLA";
		System.out.println(m.mesaje);
	  
		m.doSometing();
	   m.decimal= 30.50;	
	
	
	
	}
}




