package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Map<String,Auto> autos = new HashMap<String,Auto>();
		
		
		String modelo;
		int año;
		double precio;
		String placas;
		
		Scanner sc = new Scanner(System.in);
		
		
		int seleccion=0;
		
		Auto car = null;
		int editar=0;
		
		/*


		 * 3 Editar
		 * 5 Autos de determinada marca
	
	
		 * */
		
		do {
			//hay un error en el switch case1,se salta elnombre o una variable
			System.out.println("1: Agregar auto");
			System.out.println("2: Buscar por la placa");
			System.out.println("3: Editar");
			System.out.println("4: Eliminar");
			System.out.println("5: Autos de determinada modelo");
			System.out.println("6: Autos con años anteriores a ???");
			System.out.println("7: Buscar un auto por modelo");
			System.out.println("8: Mostrar todos");
			System.out.println("Selecciona una opción");
			
			seleccion = sc.nextInt();
			
			// hace un salto de linea,por eso se salto una variable  en el case 1
			//
			switch(seleccion) {
			case 1:
				sc.nextLine();

				System.out.println("Agrega un modelo");
				modelo = sc.nextLine();
		
					System.out.println("Ingresa el  año");
					año = sc.nextInt();
					
					System.out.println("Ingresa el precio");
					precio = sc.nextDouble();
					sc.nextLine();
							
					System.out.println("Agrega la placa");
					placas = sc.nextLine();
									
					car = new Auto(modelo, año, precio, placas);//aqui llenamos el constructor
					autos.put(placas,car);//aqui lo almacenamos al hashMap
					
				break;
				
			case 2:
				
				sc.nextLine();
				System.out.println("Escribe el nombre de la placa");
				//car=null;
				
				placas = sc.nextLine();
				
			
				if(autos.containsKey(placas)) {
					System.out.println("si existe");
					System.out.println(autos.get(placas));
				}else {
					System.out.println("no existe");
				}
				
		
				break;
			case 3:
				sc.nextLine();
				System.out.println("Escribe el nombre de la placa");
				placas = sc.nextLine();
						
				if(autos.containsKey(placas)) {
					System.out.println("Agrega un modelo");
				    modelo= sc.nextLine();
				    System.out.println("Ingresa el  año");
				 	año = sc.nextInt();
				 	System.out.println("Ingresa el precio");
					precio = sc.nextDouble();
					sc.nextLine();
					
					autos.put(placas,new Auto(modelo, año, precio, placas));
					
					break;
				}
				
				break;

			case 4:
				sc.nextLine();
				System.out.println("Escribe el nombre de la placa");
				placas = sc.nextLine();
				
				if(autos.containsKey(placas)) {
					autos.remove(placas); 
					System.out.println("SUCCES: eliminado");
					
				}else {
					System.out.println("no existe");
				}
				
				break;
			case 5:
				sc.nextLine();
				System.out.println("Ingresa el modelo");
			 	modelo = sc.nextLine();
			 	
			 	
			 	for(String m:autos.keySet()) {
			 		//System.out.println("Estos son los modelos: "+modelo);
			 	 	if(autos.get(m).getModelo().equals(modelo)) {
			 	 		
			 	 		System.out.println(autos.get(m));
			 	 	}else {
			 	 		System.out.println("No hay autos con el modelo :" + modelo);
			 	 		//break;
			 	 	}
			 	}
			 	
				
				break;
            case 6:
            	sc.nextLine();
            	System.out.println("autos de detrminado año");
            	
            	System.out.println("Ingresa el  año");
			 	año = sc.nextInt();
			 	
			 	for(String a:autos.keySet()) {
			 		
			 	 	if(autos.get(a).getAño() < año) {
			 	 		System.out.println(autos.get(a));
			 	 	}else {
			 	 		System.out.println("No hay autos con el año :" + año);
			 	 		//break;
			 	 	}
			 	}
			 	
				break;
            case 7:
            	
            	//buscar un auto por modelo
            	sc.nextLine();
				System.out.println("Escribe el modelo a buscar");
				modelo = sc.nextLine();
            
				
				for(String a:autos.keySet()) {
					if(autos.get(a).getModelo().equals(modelo) ) {
						System.out.println(autos.get(a));
					}
					
				}
				
			
	           break;
            case 8:
            	
            	//PRIMERA FORMA DE MOSTRAR 
//            	 for(String key:autos.keySet()){//va a puntar a un elemnto en particular
//		            	//para cada llave dentro(:) delconjunto de llaves hara algo
//		            	System.out.println(autos.get(key));	
//		              //keySet es una funcion de los maps
//		            }
//            	 
            	 //SEGUNDA FORMA DE MOSTRAR
            	 for(Entry<String,Auto> a:autos.entrySet()) {
            		 System.out.println(a);
            		 //System.out.println(a.getKey());//muestra solo las claves
            		 
            	 }
	
	           break;
            case 9:
	
	           break;
				default:
					System.out.println("Fin del programa");
			
			}
					
		}while(seleccion>=1 && seleccion<=9);
		
	}

}
