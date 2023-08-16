package paquete;

import com.Modelo;

public class Externa extends Modelo{
	//Encapsulamiento:regular, controlar,que tanto podemos aacceder a los atributos
   //que tanto quieres restringir los atributo
	
   
	/*        in
	 * private 
	 * public 
	 * protec
	 * */
	
	
	Modelo model = new Modelo();//debemos importar el paquete ya que esta en otro paquete
	
	public Externa() {
		
		//model.mensaje;//marca error por que es de tipo protected,lo cual esta en otro paquete llamado com
		//solo podemos acceder dentro del paquete
		
		//model.decimal;
		
		
		this.mensaje = "otra cosa";//unicamente mediante la herencia,podemos acceder al tipo protected de otros paquetes externos
		//debemos pner en la clase la palabra reservada extends seguido de la clasea heredar
		
	}
	
	
	
	
	
}
