package com;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListDeArrayList {

private static final String nombreFichero = "C:\\numeros.txt";
	
	public static void main (String args[]){
		
		
		System.out.println("... Nos creamos un ArrayList de ArrayList ...");
		List<ArrayList<Integer>> arrayListNumeros = new ArrayList<ArrayList<Integer>>();
		
		// Instanciamos el fichero donde estan los datos
		File fichero = new File(nombreFichero);
		Scanner s = null;
		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);
			// Obtengo los datos de los partidos de fútbol del fichero

			
			while (s.hasNextLine()){
				String linea = s.nextLine();	// Obtengo una linea del fichero con los numeros
				String [] cortarString = linea.split(" ");		// Obtengo los numeros de la linea en un array
				System.out.println("Cortar String " + Arrays.toString(cortarString));
				ArrayList<Integer> numeros = new ArrayList<Integer>();
				// Pongo los numeros de la fila en el ArrayList
				for (int i=0; i<cortarString.length; i++){
					numeros.add(Integer.parseInt(cortarString[i]));
					System.out.println("Cortar String en el for valores " + (cortarString[i]));
				}
				// Añado el ArrayList de enteros al ArratList de ArrayList
				arrayListNumeros.add(numeros);
				System.out.println("Imprimir numero " + numeros);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if (s != null)
					s.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		// Para ver que hemos leido bien los numeros del fichero, recorremos el ArrayList de
		// ArrayList y lo mostramos por pantalla.
		System.out.println("\n... Contenido de los ArrayList del ArrayList ...");
		Iterator<ArrayList<Integer>> itrArrayListNumeros = arrayListNumeros.iterator();
		while(itrArrayListNumeros.hasNext()){
			ArrayList<Integer> numeros = itrArrayListNumeros.next();
			Iterator<Integer> itrNumeros = numeros.iterator();
			System.out.println("Primer while");
			while(itrNumeros.hasNext()){
				int numero = itrNumeros.next();
				System.out.print(numero+" ");
				System.out.println("Segundo while");
			}
			System.out.println();
		}
		
		// Recorremos los ArrayList que hay en el ArrayList y eliminamos los numeros que son cero
		itrArrayListNumeros = arrayListNumeros.iterator();
		while(itrArrayListNumeros.hasNext()){
			ArrayList<Integer> numeros = itrArrayListNumeros.next();
			Iterator<Integer> itrNumeros = numeros.iterator();
			while(itrNumeros.hasNext()){
				int numero = itrNumeros.next();
				if (numero == 0)
					itrNumeros.remove();
			}
		}
		
		// Recorremos el ArrayList de los ArrayList y eliminamos los ArrayList que no
		// contengan elementos
		itrArrayListNumeros = arrayListNumeros.iterator();
		while(itrArrayListNumeros.hasNext()){
			ArrayList<Integer> numeros = itrArrayListNumeros.next();
			// Si el ArrayList esta vacio, lo eliminamos del ArrayList
			if (numeros.isEmpty())
				itrArrayListNumeros.remove();
		}
		
		// Mostramos el ArrayList tras eliminar todos los ceros
		String salida = "";
		System.out.println("\n... Salida sin ceros ...");
		itrArrayListNumeros = arrayListNumeros.iterator();
		while(itrArrayListNumeros.hasNext()){
			ArrayList<Integer> numeros = itrArrayListNumeros.next();
			Iterator<Integer> itrNumeros = numeros.iterator();
			while(itrNumeros.hasNext()){
				int numero = itrNumeros.next();
				salida += numero+" ";
			}
			salida += "\n";
		}
		
		System.out.println(salida);
		
		
	}

}
