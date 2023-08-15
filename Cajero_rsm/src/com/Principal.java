package com;

import java.util.Date;

public class Principal {
	public static void main(String[] args) {
		
		Cajero caj= new  Cajero("Av Juarez");
		
		//System.out.println(new Date(123,7,15,17,15));
	
		CuentaBancaria cuenta1= new CuentaBancaria(
				"0011",
				4500.50, 
				"Luis", 
				new Date(121,7,15), 
				300, 
				5000, 
				"Debito");
		
		CuentaBancaria cuenta2= new CuentaBancaria(
				"0023",
				8000, 
				"Raul", 
				new Date(121,7,15), 
				2000, 
				15000, 
				"Debito");
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
		System.out.println(caj.retirar(cuenta1, 2000));
		System.out.println(cuenta1.getSaldo());
		
		System.out.println(caj.depositar(cuenta1, 1300));
		System.out.println(cuenta1.getSaldo());
		
		System.out.println(caj.trasnferir(cuenta1, cuenta2, 1500));
		System.out.println(cuenta2.getSaldo());
				
	}

	
}
