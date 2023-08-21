package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		//Lista es una interface
		
		//ArrayList es una clase que implemnta la interface list
		//Se crea la nueva lista
		List<String> lista= new ArrayList<String>();
		
		// Añade el elemento al ArrayList
		lista.add(0,"Elemento1");
		lista.add(1,"Elemento2");
		lista.add(2,"Elemento3");
		lista.add(3,"Elemento4");
		lista.add(4,"Elemento5");
		lista.add(5,"Elemento6");
		lista.add(6,"Elemento7");
		lista.add(7,"Elemento8");
		lista.add(8,"Elemento8");
		// Añade el elemento al ArrayList en la posición 'n'
	
		// Devuelve el numero de elementos del ArrayList
		lista.size();
		System.out.println("Numero elementos contenidos SIZE "+lista.size());
		// Devuelve el elemento que esta en la posición '2' del ArrayList
		lista.get(1);
		System.out.println("Regresa el elemento buscado, GET "+ lista.get(3));
		// Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
		lista.contains("Elemento");
		System.out.println("Verifica si existe un elemento CONTAINS "+ lista.contains("Elemento5"));
		// Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
		lista.indexOf("Elemento");
		System.out.println("Verifica si existe un elemento en la lista y regresa posicion INDEXOF "+ lista.indexOf("Elemento7"));
		// Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
		lista.lastIndexOf("Elemento");
		System.out.println("Regresa la ultima coincidencia LASTINDEXOF "+ lista.lastIndexOf("Elemento8"));
		// Borra el elemento de la posición '5' del ArrayList   
		lista.remove(5); 
		System.out.println("Borra el elemento indicado REMOVE"+ lista.remove(5));
		// Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
		//lista.remove("Elemento");
		//Borra todos los elementos de ArrayList   
		//lista.clear();
		System.out.println("Borra todos los elementos de la lista CLEAR");
		// Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
		lista.isEmpty();
		System.out.println("Valida si la lista esta vacia ISEMPTY");
		// Copiar una lista 
		List<String> copia= new ArrayList<>(lista);
		// Pasa el ArrayList o lista a un Array 
		Object[] array = copia.toArray();  
		
		System.out.println("clonada "+lista.toString());
		System.out.println("Original "+ Arrays.toString(array));
		System.out.println("Imprimir solo la lista "+ copia.toString());
		
		System.out.println("****************************************Ciclo foreach");
		//Ciclo ForEach recorrer la lista obtener los valores
		for(String val : lista) {
			System.out.println(val);
		}
		
		System.out.println("****************************************Fin foreach");
		
		// Declaración el ArrayList
		ArrayList<String> nombreArrayList = new ArrayList<String>();

		// Añadimos 10 Elementos en el ArrayList
		for (int i=1; i<=10; i++){
			nombreArrayList.add("Elemento "+i); 
		}
		
		// Añadimos un nuevo elemento al ArrayList en la posición 2
		nombreArrayList.add(2, "Elemento 3");
		System.out.println(nombreArrayList.toString()); 
		System.out.println("**************************************** Inicio while");
		// Declaramos el Iterador e imprimimos los Elementos del ArrayList
		Iterator<String> nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			System.out.print(elemento+" / ");
		}
		System.out.println();
		System.out.println("**************************************** fin while");
		/*
		//Ciclo ForEach
				for(String val : nombreArrayList) {
					System.out.println(val + "/");
				}*/
		
		// Recordar que previamente ya hemos declarado el ArrayList y el Iterator de la siguiente forma:
		// ArrayList<String> nombreArrayList = new ArrayList<String>();
		// Iterator<String> nombreIterator = nombreArrayList.iterator();

		// Obtenemos el numero de elementos del ArrayList
		int numElementos = nombreArrayList.size();
		System.out.println("nnEl ArrayList tiene "+numElementos+" elementos");

		// Eliminamos el primer elemento del ArrayList, es decir el que ocupa la posición '0'
		System.out.println("n... Eliminamos el primer elemento del ArrayList ("+nombreArrayList.get(0)+")...");
		nombreArrayList.remove(0);

		// Eliminamos los elementos de ArrayList que sean iguales a "Elemento 3"
		System.out.println("n... Eliminamos los elementos de ArrayList que sean iguales a Elemento3");
		nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			if(elemento.equals("Elemento 3"))
				nombreIterator.remove();	// Eliminamos el Elemento que hemos obtenido del Iterator
		}

		// Imprimimos el ArrayList despues de eliminar los elementos iguales a "Elemento 3"
		System.out.println("nImprimimos los elementos del ArrayList tras realizar las eliminaciones: ");
		nombreIterator = nombreArrayList.iterator();
		while(nombreIterator.hasNext()){
			String elemento = nombreIterator.next();
			System.out.print(elemento+" / ");
		}

		// Mostramos el numero de elementos que tiene el ArrayList tras las eliminaciones:
		numElementos = nombreArrayList.size();
		System.out.println("nNumero de elementos del ArrayList tras las eliminaciones = "+numElementos);
		System.out.println("****************************************");
		
		
	}
}
