package com;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Principal {
	
	public static void main(String[] args) {
		
		Map<String, Autos> autos = new HashMap<String, Autos>();
		String modelo;
		String marca;
		int año;
		double precio;
		String placas;
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		Autos a = null;
		boolean existe = false;
		/*
		 * 1 Agregar
		 * 2 Buscar
		 * 3 Editar
		 * 4 Eliminar
		 * 5 Autos de una determinaa marca
		 * 6 Autos con años anteiores
		 * 7 Buscar un auto por modelo
		 * 8 Mostrar todos
		 * 9 Salir
		 */
		
	
		do {
			System.out.println("Selecciona una opcion");
			System.out.println("1 Agregar un elemento");
			System.out.println("2 Buscar un elemento");
			System.out.println("3 Editar");
			System.out.println("4 Eliminar");
			System.out.println("5 Buscar autos por una marca");
			System.out.println("6 Buscar autos anteriores al año");
			System.out.println("7 Buscar por un modelo");
			System.out.println("8 Mostrar todos los elementos");
			System.out.println("9 Salir");
			opcion = sc.nextInt();
			
			sc.nextLine();
			
			switch(opcion) {
			case 1:
				System.out.println("Marca del automovil");
				marca = sc.nextLine();
				System.out.println("Modelo del automovil");
				modelo = sc.nextLine();
				System.out.println("Placas del automovil");
				placas = sc.nextLine();
				System.out.println("Año del automovil");
				año = sc.nextInt();
				System.out.println("Precio del automovil");
				precio = sc.nextDouble();
				
				a = new Autos(modelo,año, precio, placas, marca);
				autos.put(a.getPlacas(), a);
				a = null;
				break;
			case 2:
				System.out.println("Placas del automovil");
				placas = sc.nextLine();
				existe = autos.containsKey(placas);
				if(existe) {
					System.out.println(autos.get(placas));			
				} else {
					System.out.println("El auto no existe");
				}
				break;
			case 3: 
				System.out.println("Placas del automovil");
				placas = sc.nextLine();
				existe = autos.containsKey(placas);
				if(existe) {
					System.out.println("Marca del automovil");
					marca = sc.nextLine();
					System.out.println("Modelo del automovil");
					modelo = sc.nextLine();
					System.out.println("Año del automovil");
					año = sc.nextInt();
					System.out.println("Precio del automovil");
					precio = sc.nextDouble();
					autos.put(placas, new Autos(modelo, año, precio, placas, marca));
				} else {
					System.out.println("No existe el automovil, no hay"
							+ "nada que modificar");
				}
				break;
			case 4:
				System.out.println("Placas del automovil");
				placas = sc.nextLine();
				autos.remove(placas);
				break;
			case 5:
				System.out.println("Marca del automovil");
				marca = sc.nextLine();
				for (String key : autos.keySet()) {
					if(autos.get(key).getMarca().equals(marca)) {
						System.out.println(autos.get(key));
					}
				}
				break;
			case 6:
				System.out.println("Año del automovil");
				año = sc.nextInt();
				for (String key : autos.keySet()) {
					if(año <= autos.get(key).getAño()) {
						System.out.println(autos.get(key));
					}
				}
				break;
			case 7: 
				System.out.println("Modelo del automovil");
				modelo = sc.nextLine();
				for (String key : autos.keySet()) {
					if(autos.get(key).getModelo().equals(modelo)) {
						System.out.println(autos.get(key));
					}
				}
				break;
			case 8:
				for (String key : autos.keySet()) {
					System.out.println(autos.get(key));
				}
				break;
			case 9:
				System.out.println("Saliendo del programa ");
				break;
				
			default:
			}
			
		} while (opcion > 0 && opcion <= 9);
	}

}
