package com;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		
		Cajero caj = new Cajero("Av. Juarez #128");
		
		CuentaBancaria cuenta1 = new CuentaBancaria("17887022", 4500.50, "Walter", 
				new Date(123,0,20), 300, 5000, "debito");
		
		CuentaBancaria cuenta2 = new CuentaBancaria("17887023", 8000.00, "Fahrit", 
				new Date(123,9,15), 2000, 15000, "debito");
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
		System.out.println(caj.retirar(cuenta1, 2000));
		System.out.println(cuenta1.getSaldo());
		
		System.out.println(caj.depositar(cuenta1, 1300));
		System.out.println(cuenta1.getSaldo());
		
		caj.transferir(cuenta1, cuenta2, 1500);
		System.out.println(cuenta2.getSaldo());
		
	}
}
