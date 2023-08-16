package com;

public class Principal {
public static void main(String[] args){
	
	
Modelo m = new Modelo();
	
	//m.x = 20; acceso incorrecto por ser private
	
	m.setX(20);//forma correcta de acceder 
	m.getX();// atributo private, con los getter && Setters
	
	m.mensaje = "hola! te Amo <3";
	System.out.println(m.mensaje);
	m.doSometing();
	

	
}//	fin main

	
}// fin class
