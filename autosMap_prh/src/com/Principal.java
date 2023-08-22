package com;
import java.util.*;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		Map<String, Auto> autos = new HashMap<String, Auto>();
		String marca;
		String modelo;
		int año;
		double precio;
		String placa;
		
		/*
		 * 1 agregar
		 * 2 buscar por placas
		 * 3 editar 
		 * 4 eliminar 
		 * 5 autos de una determinada modelo 
		 * 6 autos con años anteriores a??
		 * 7 buscar un auto por modelo utilizando key set
		 * 8 mostrar todos 
		 * 9 salir
		 */
		
		Scanner sc= new Scanner(System.in);
		int seleccion= 0;
		Auto a = null;
		
		do {
			System.out.println("1: Agregar auto");
			System.out.println("2: ingrese el numero de placa");
			System.out.println("3: Editar autos");
			System.out.println("4: Eliminar autos");
			System.out.println("5: Mostrar los autos de la marca ingresada");
			System.out.println("6: Mostrar los autos anteriores al año ingresado");
			System.out.println("7: Mostrar el auto del modelo ingresado");
			System.out.println("8: Mostrar todos los autos");
			System.out.println("9: Salir");
			
			seleccion = sc.nextInt(); //capturo la seleccion del usuario 
			
			switch(seleccion) {
			
			case 1:
				sc.nextLine();
				System.out.println("Ingresa la marca");
				marca = sc.nextLine();
				if(marca.equals("")) {
					while(marca.equals("")) {
						System.out.println("Es necesario ingresar la marca, intente de nuevo");
						marca = sc.nextLine();
				}
				}
				System.out.println("Ingresa el modelo");
				modelo = sc.nextLine();
				if(modelo.equals("")) {
					while(modelo.equals("")) {
						System.out.println("Es necesario ingresar el modelo, intente de nuevo");
						modelo = sc.nextLine();
				}
				}
				System.out.println("Ingrese el año del modelo");
				año= sc.nextInt();
				if (año<=0) {
					while(año<=0) {
						System.out.println("Es necesario ingresar el año del modelo");
						año = sc.nextInt();
					}
				}
				System.out.println("Ingrese el precio del modelo");
				precio = sc.nextDouble();
				if (precio<=0) {
					while(precio<=0) {
						System.out.println("Es necesario ingresar el precio del modelo");
					    precio = sc.nextDouble();
					    
					}
				}sc.nextLine();
				
				System.out.println("Ingresa la placa");
				placa = sc.nextLine();
				
				a = new Auto(marca, modelo, año, precio, placa);
				autos.put(a.getPlaca(), a);
				break;
				
			case 2:
				sc.nextLine();
				System.out.println("Ingresa la placa");
				placa= sc.nextLine();
				if(autos.containsKey(placa)){
					System.out.println(autos.get(placa));
				}else 
					System.out.println("La placa no existe");

				break;
			
			case 3:
				sc.nextLine();
				System.out.println("Ingrese la placa que desea editar");
				placa=sc.nextLine();
				if(autos.containsKey(placa)){
					
					System.out.println("Ingresa la marca");
					marca = sc.nextLine();
					System.out.println("Ingresa el modelo");
					modelo = sc.nextLine();
					System.out.println("ingrese el año");
					año= sc.nextInt();
					System.out.println("Ingrese el precio del modelo");
					precio = sc.nextDouble();
					
					autos.put(placa, new Auto(marca, modelo, año, precio, placa));
					break;
					}	
				break;
			
			case 4:
				sc.nextLine();
				System.out.println("Ingrese la placa del auto que desea eliminar");
				placa=sc.nextLine();
				if(autos.containsKey(placa)) {
					autos.remove(placa);
				}
				break;
				
			case 5:
				sc.nextLine();
				System.out.println("Ingresa la marca");
			 	marca = sc.nextLine();
			 	
			 	for(String m:autos.keySet()) {
			 	 	if(autos.get(m).getMarca().equals(marca)) {
			 	 		
			 	 		System.out.println(autos.get(m));
			 	 }
			 	
				}
				break;
				
			case 6:
				sc.nextLine();
				System.out.println("Ingresa el año del auto");
			 	año = sc.nextInt();
			 	for(String an:autos.keySet()) {
			 		
			 	 	if(autos.get(an).getAño()<=(año)) {
			 	 		
			 	 		System.out.println(autos.get(an));
			 	 	}
			 	 	}
				break;
				
			case 7:
				sc.nextLine();
				System.out.println("Ingresa el modelo");
			 	modelo = sc.nextLine();
			 	
			 	for(String mo:autos.keySet()) {
			 	 	if(autos.get(mo).getModelo().equals(modelo)) {
			 	 		
			 	 		System.out.println(autos.get(mo));
			 	 	}
			 	}
				break;
				
			case 8:
				for (String key: autos.keySet()) {
					System.out.println(autos.get(key));
				}
				break;
				default:
				System.out.println("Fin del programa");
		
			}
			
				
				
			
			
			
	}while(seleccion>=1 && seleccion<=10);
	}

}
