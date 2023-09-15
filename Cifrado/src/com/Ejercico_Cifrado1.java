package com;
import java.util.*;
public class Ejercico_Cifrado1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leer desde teclado nombre completo y edad 
		// transformar 
		// angel raul diaz 18
		// devolver el nombre de la siguiente manera 
		// BOHFM-DJDJD-FDHFHF 8
		// ARRAYS
		//INDEXOF
		//EQUALS
		//OR AND 
		//CHARAT
		Scanner sc= new Scanner(System.in);
		System.out.println("ingrese su nombre completo y edad");
		
		// 0123456789
		
		String nombreCompleto = sc.nextLine();//caracteres completos pero juntos
		String numeros = "1234567890";
		String vocales= "aeiouAEIOU";
		int suma=0;
		int contador = 0;
		String[] nombre = new String[nombreCompleto.length()];
		
		//llenar dinamicamente el array desde un string
		for (int i = 0; i < nombreCompleto.length(); i++) {
			//    0              "p"                    'p'   0
			nombre[i]=Character.toString(nombreCompleto.charAt(i));
		} System.out.println(Arrays.toString(nombre));
		
		//iterar el array para filtrar letras de numeros
		
		 for (int i = 0; i < nombre.length; i++) {
			
			  if(numeros.indexOf(nombre[i])>=0) {//verificar si es un numero
				
				// la variable suma recibe los valores que si cumplen el criterio 
				suma = suma + Integer.parseInt(nombre[i]);
			  }else if (vocales.indexOf(nombre[i])>=0) {
				  contador++;
			  }			
				
			}
		 System.out.println(" Vocales: " + contador);
		 System.out.println(" Sumatoria " + suma);
		
	
			
			
		

	}
}


