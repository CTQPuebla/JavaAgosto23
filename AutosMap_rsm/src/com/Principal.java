package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Map<String, Auto> autos= new HashMap<String,Auto>();
		
		String modelo;
		int año;
		double precio;
		String placas;
		
		int seleccion=0;
		Scanner sc = new Scanner(System.in);
		Auto a= null;
	
		/*
		 * 1Agregar
		 * 2Buscar
		 * 3Editar
		 * 4Eliminar
		 * 5Autos de una deterinada marca
		 * 6Autos con años anteriores a 2015
		 * 7Buscar auto por modelo
		 * 8Mostrar todos
		 * 9Salir
		 * */
		do {
			
			System.out.println("1: Agregar");
			System.out.println("2: Buscar");
			System.out.println("3: Editar");
			System.out.println("4: Eliminar");
			System.out.println("5: Autos con determinada marca?");
			System.out.println("6: Autos con años anteriores?");
			System.out.println("7: Buscar auto por modelo?");
			System.out.println("8: Mostrar todos");
			System.out.println("9: Salir");
			
			//Guarda la seleccion que ingresa el usuario
			seleccion=sc.nextInt();
			
			switch(seleccion) {
			
			case 1:
				sc.nextLine();
				System.out.println("Ingresa modelo");
				modelo= sc.nextLine();
				System.out.println("Ingresa año");
				año= sc.nextInt();
				System.out.println("Ingresa precio");
				precio= sc.nextDouble();
				sc.nextLine();
				System.out.println("Ingresa Placas");
				placas= sc.nextLine();
				a=new Auto(modelo, año, precio, placas);
				autos.put(a.getPlacas(),a);
				break;
			case 2:
				sc.nextLine();
				System.out.println("Ingresa placas a buscar");
				placas=sc.nextLine();
				for (String key:autos.keySet()) {
					//buscar el elemento
					//System.out.println("Placa "+placas);
					if(autos.get(key).getPlacas().equals(placas)) {
						System.out.println("Existe");
						break;
					}
					
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("Ingresa placas a editar");
				placas=sc.nextLine();
				for (String key:autos.keySet()) {
					if(autos.get(key).getPlacas().equals(placas)) {
						System.out.println("Ingresa modelo");
						modelo= sc.nextLine();
						System.out.println("Ingresa año");
						año= sc.nextInt();
						System.out.println("Ingresa precio");
						precio= sc.nextDouble();
						sc.nextLine();
						autos.get(key).setModelo(modelo);
						autos.get(key).setAño(año);
						autos.get(key).setPrecio(precio);
						break;
					}
				}
				break;
			case 4:
				sc.nextLine();
				System.out.println("Ingresa placas a eliminar");
				placas=sc.nextLine();
				for (String key:autos.keySet()) {
					if(autos.get(key).getPlacas().equals(placas)) {
						autos.remove(key);
						break;
					}
				}
				break;
			case 5:
				sc.nextLine();
				System.out.println("Autos con determinada marca");
				modelo=sc.nextLine();
				for (String key:autos.keySet()) {
					if(autos.get(key).getModelo().equals(modelo)) {
						System.out.println(autos.get(key));
					}
				}
				break;
			case 6:
				sc.nextLine();
				System.out.println("Autos con año anterior a ");
				año=sc.nextInt();
				for (String key:autos.keySet()) {
					if(autos.get(key).getAño()<=año) {
						System.out.println(autos.get(key));
					}
				}
				break;
			case 7:
				sc.nextLine();
				System.out.println("Autos con marca");
				modelo=sc.nextLine();
				for (String key:autos.keySet()) {
					if(autos.get(key).getModelo().equals(modelo)) {
						System.out.println(autos.get(key));
					}
				}
				break;
//			case 2:
//				sc.nextLine();
//				System.out.println("Ingresa el nombre a buscar");
//				nombre= sc.nextLine();
//				for (int i=0; i<lista.size(); i++) {
//					if(lista.get(i).getNombre().equals(nombre)) {
//						c=lista.get(i);
//						//cc= lista.get(i);
//						//System.out.println("si existe el nombre");
//						break;
//					}else
//					{
//						cc=1;
//					}
//				}
//				//System.out.println(c);
////				if(!c.equals(null)) {
////					System.out.println(c);
////				}else
////				{
////					System.out.println("No existe");
////				}
//				if(cc==1) {
//					System.out.println(c);
//					System.out.println("No existe");
//				}
//				break;
//			case 3:
//				sc.nextLine();
//				System.out.println("Ingresa el nombre a modificar");
//				nombre= sc.nextLine();
//				for (int i=0; i<=lista.size(); i++) {
//					if(lista.get(i).getNombre().equals(nombre)) {
//						System.out.println("Ingresa numero");
//						numTelefono= sc.nextLine();
//						System.out.println("Ingresa direccion");
//						direccion= sc.nextLine();
//						System.out.println("Ingresa correo");
//						correo= sc.nextLine();
//						//Actualizar elementos de la lista
//						lista.get(i).setNumTelefono(numTelefono);
//						lista.get(i).setDireccion(direccion);
//						lista.get(i).setCorreo(correo);
//						break;
//					}
//				}
//				break;
//			case 4:
//				sc.nextLine();
//				System.out.println("Ingresa el nombre a eliminar");
//				nombre= sc.nextLine();
//				for (int i=0; i<=lista.size(); i++) {
//					if(lista.get(i).getNombre().equals(nombre)) {
//						lista.remove(i);
//						System.out.println("Registro eliminado");
//						break;
//					}
//				}
//				break;
//			case 5:
//				sc.nextLine();
//				for (int i=0; i<lista.size(); i++) {
//					System.out.println(lista.get(i));
//				}
//				break;
				
			case 8:
				sc.nextLine();
				for (String key:autos.keySet()) {
					//Sacamos los elementos
					System.out.println(autos.get(key));
					
				}
			}
			
		} while (seleccion>=1 && seleccion<=9);
		
		
	}
}
