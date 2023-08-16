package com;

public class Principal {

	   public static void main(String[] args) {
		   
		   Modelo m = new Modelo();
		   
		  // m.x = 20; acceso incorrecto por ser private
		   
		   m.setX(20); //forma correcta de acceder al atributo private
		   m.getX();   // con los getter y setters
		   
		   m.mensaje="Hola";
		   System.out.println(m.mensaje);
		   
		   m.decimal = 30.5; // lo correcto es acceder a el con get y set
		   
	   }
}
