package com;

import java.util.Date;

public class Pincipal {
	
	public static void main(String[] args) {
		
	//System.out.println(new Date(123, 7, 15, 17, 15));	
		Cajero caj =new Cajero("Av. Juarez #128");
	CuentaBancaria cuenta1 = new CuentaBancaria("0011", 4500.50,"Erick", new Date(123,0,20), 300, 5000,"Debito");
	CuentaBancaria cuenta2 = new CuentaBancaria("0023", 8000.00," Laura", new Date(122, 9, 15), 2000, 15000,"Debito");
	
	System.out.println(cuenta1);
	System.out.println(cuenta2);
	
	System.out.println(caj.retirar(cuenta1, 2000));
	System.out.println(cuenta1.getSaldo());
	
	System.out.println(caj.depositar(cuenta1,1300));
	System.out.println(cuenta1.getSaldo());
	
	//caj.transferir(cuenta1, cuenta2, 1500);
	//System.out.println(cuenta2.getSaldo());
	System.out.println(caj.transferir(cuenta1, cuenta2, 1500));
	System.out.println(cuenta2.getSaldo());
	}

}
