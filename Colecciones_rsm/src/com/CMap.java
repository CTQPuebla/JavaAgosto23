package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CMap {
	public static void main(String[] args) {
		
		// Declaraci�n de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los m�s utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos at�micos
		Map<Integer, String> nombreMap = new HashMap<Integer, String>();
		nombreMap.put(1,"test1");
		nombreMap.put(2,"test1");
		nombreMap.put(3,"test1");
		nombreMap.put(4,"test1");
		nombreMap.put(5,"test1");
		nombreMap.put(5,"test1");
		nombreMap.put(6,"test1");
		
		nombreMap.size(); // Devuelve el numero de elementos del Map
		nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
		nombreMap.put(1,"test1"); // A�ade un elemento al Map
		nombreMap.get(0); // Devuelve el valor de la clave que se le pasa como par�metro o 'null' si la clave no existe
		//nombreMap.clear(); // Borra todos los componentes del Map
		nombreMap.remove(3); // Borra el par clave/valor de la clave que se le pasa como par�metro
		nombreMap.containsKey(1); // Devuelve true si en el map hay una clave que coincide con K
		nombreMap.containsValue("test1"); // Devuelve true si en el map hay un Valor que coincide con V
		nombreMap.values(); // Devuelve una "Collection" con los val
		System.out.println(nombreMap.toString());
		
		System.out.println("--------------HashMap nos da los objetos sin un \"orden l�gico\":");
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Casillas");		map.put(15, "Ramos");
		map.put(3, "Pique");		map.put(5, "Puyol");
		map.put(11, "Capdevila");	map.put(14, "Xabi Alonso");
		map.put(16, "Busquets");	map.put(8, "Xavi Hernandez");
		map.put(18, "Pedrito");		map.put(6, "Iniesta");
		map.put(7, "Villa");

		// Imprimimos el Map con un Iterador
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
		  Integer key = (Integer) it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
		}
		
		System.out.println("--------------TreeMap nos da los objetos sin un \"orden l�gico\":");
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Casillas");	treeMap.put(15, "Ramos");
		treeMap.put(3, "Pique");	treeMap.put(5, "Puyol");
		treeMap.put(11, "Capdevila");	treeMap.put(14, "Xabi Alonso");
		treeMap.put(16, "Busquets");	treeMap.put(8, "Xavi Hernandez");
		treeMap.put(18, "Pedrito");	treeMap.put(6, "Iniesta");
		treeMap.put(7, "Villa");

		// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
		it = treeMap.keySet().iterator();
		while(it.hasNext()){
		  Integer key = (Integer) it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
		}
		
		System.out.println("------------LinkedHashMap ordena los objetos tal y como los hemos ido introduciendo");
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(1, "Casillas");	linkedHashMap.put(15, "Ramos");
		linkedHashMap.put(3, "Pique");		linkedHashMap.put(5, "Puyol");
		linkedHashMap.put(11, "Capdevila");	linkedHashMap.put(14, "Xabi Alonso");
		linkedHashMap.put(16, "Busquets");	linkedHashMap.put(8, "Xavi Hernandez");
		linkedHashMap.put(18, "Pedrito");	linkedHashMap.put(6, "Iniesta");
		linkedHashMap.put(7, "Villa");

		// Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
		it = linkedHashMap.keySet().iterator();
		while(it.hasNext()){
		  Integer key = (Integer) it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
		}
		
		
		System.out.println("********* Trabajando con los m�todos de Map *********");
		System.out.println("Mostramos el numero de elementos que tiene el TreeMap: treeMap.size() = "+treeMap.size());
		System.out.println("Vemos si el TreeMap esta vacio : treeMap.isEmpty() = "+treeMap.isEmpty());
		System.out.println("Obtenemos un elemento del Map pasandole la clave 6: treeMap.get(6) = "+treeMap.get(6));
		System.out.println("Borramos un elemento del Map el 18 (porque fue sustituido): treeMap.remove(18)"+treeMap.remove(18));
		System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: treeMap.get(18) = "+treeMap.get(18));
		System.out.println("Vemos si existe un elemento con la clave 18: treeMap.containsKey(18) = "+treeMap.containsKey(18));
		System.out.println("Vemos si existe un elemento con la clave 1: treeMap.containsKey(1) = "+treeMap.containsKey(1));
		System.out.println("Vemos si existe el valo 'Villa' en el Map: treeMap.containsValue(Villa) =" +treeMap.containsValue("Villa"));
		System.out.println("Vemos si existe el valo 'Ricardo' en el Map: treeMap.containsValue(Ricardo)= "+treeMap.containsValue("Ricardo"));
		System.out.println("Borramos todos los elementos del Map: treeMap.clear()");treeMap.clear();
		System.out.println("Comprobamos si lo hemos eliminado viendo su tama�o: treeMap.size() = "+treeMap.size());
		System.out.println("Lo comprobamos tambien viendo si esta vacio treeMap.isEmpty() = "+treeMap.isEmpty());
		
		System.out.println("Foreach: Forma alternativa para recorrer los Map mostrando la Clave y el valor:");
		for (Entry<Integer, String> jugador : linkedHashMap.entrySet()){
			Integer clave = jugador.getKey();
			String valor = jugador.getValue();
			System.out.println(clave+"  ->  "+valor);
		}
		
		}
}
