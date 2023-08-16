package com;

public class Principal {
	
	public static void main(String[] args) {
		
		
	       Modelo m = new Modelo();
	       
	       
	       //-------PRIVATE-----------------
	     //  m.x =20; //marca error ya que es privado el atributo,tenemos que acceder con los geters y setter,acceso incorrecto
	       
	       //si queremos acceder al atributo,debemos de utilizar geter y seter
	       
	       m.setX(20);//FORMA CORRECTA DE ACCEDER AL ATRIBUTO  PRIVATE,CON GETTERS Y SETTERS
	       m.getX();
	       
	       
	       //-------------PROTECTED-----------------------
	       m.mensaje="hola mi chingon";//mensaje si podemos ver,no es necesario acceder con los getter y setters
	       System.out.println(m.mensaje);
	       
	       m.doSomething();//todo accedido desde el interior  de la clase  y otras clases
	       
	       
//	       Nota:acceder con los getters y setter siempre aunque sea public
	       m.decimal = 30.6;//
	
		
	}

}
