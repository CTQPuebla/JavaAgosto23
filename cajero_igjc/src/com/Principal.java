package com;
import java.util.Date;
public class Principal {

	public static void main(String[]args) {
		
	Cajero caj = new Cajero("Av. Juarez #128");
	CuentaBancaria cuenta1 = new CuentaBancaria("1516", 4500.50,"GABRIEL",new Date(), 300.00, 5000.00, "debito");
	CuentaBancaria cuenta2 = new CuentaBancaria("0023", 8000, "JUAN",
			new Date(), 2000, 15000, "Debito");
	
	System.out.println(cuenta1);
	System.out.println(cuenta2);
	
	System.out.println(caj.retirar(cuenta1,2000));
	System.out.println(cuenta1.getSaldo());
	
	System.out.println(caj.depositar(cuenta1, 1300));
	System.out.println(cuenta1.getSaldo());
	 
	System.out.println(caj.transferir(cuenta1, cuenta2, 1500));
	System.out.println(cuenta2.getSaldo());
	}
}

