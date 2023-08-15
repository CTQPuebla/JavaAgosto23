package com;

import java.util.Date;

public class Cajero {
	
	String direccion;
	int folio = 0;
	
	public Cajero() {
		
	}

	public Cajero(String direccion) {
		super();
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cajero [direccion=" + direccion + "]";
	}
	
	//Comportamientos
	//Retirar, depositar, transferir
	
	public Ticket retirar(CuentaBancaria cuenta, double monto) {
		Ticket ticket = null;
		
		
		//Valor que la cantidad sea multiplos de 100
		if(monto%50 != 0) {
			System.out.println("La cantidad no incluye monedad");
		} else if(monto>cuenta.getSaldo()) {
			System.out.println("Saldo insuficiente");
		} else if(cuenta.getMin()> cuenta.getSaldo()-monto) {
			System.out.println("El retiro dejaria la cuenta por debajo del minimo de la cuenta");
		}else {
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			folio += 1;
			ticket = new Ticket(this.direccion, 
					new Date(), folio, monto, cuenta.getNumCuenta());
		}
		
		return ticket;
	}
	
	public Ticket depositar(CuentaBancaria cuenta, double monto) {
		Ticket ticket = null;
		
		if(monto > cuenta.getMax()) {
			System.out.println("El monto excede el maximo de la cuenta");
		} else if(cuenta.getMax() < cuenta.getSaldo()+monto){
			System.out.println("La cantidad excede el limite");
		} else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			folio += 1;
			ticket = new Ticket(this.direccion, 
					new Date(), folio++, monto, cuenta.getNumCuenta());
		}
		
		return ticket;
	}
	
	public Ticket transferir(CuentaBancaria origen, CuentaBancaria destino, double monto) {
		Ticket ticket = null;
		
		if(monto > origen.getSaldo()) {
			System.out.println("No se puede hacer la transferencia");
		} else if( origen.getSaldo()-monto < origen.getMin() ) {
			System.out.println("La transferiencia haria que la cuenta origen quede por"
					+ " debajo del minimo");
		} else if(destino.getMax() < monto) {
			System.out.println("El monto excede el limite");
		} else if(destino.getMax() < monto+destino.getSaldo()) { //monto + destino > destino.getMax
			System.out.println("El saldo de la cuenta destino excederia el limite");
		} else {
			origen.setSaldo(origen.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			folio +=1;
			ticket = new Ticket(this.direccion, new Date(), folio++, monto, origen.getNumCuenta(), destino.getNumCuenta());
		}
		return ticket;
	}
		

}
