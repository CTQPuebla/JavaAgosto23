package com;

import java.util.Date;

public class Cajero {
	
	String direccion;
	int folio=0;
	
	public Cajero() {
		
	}
	//construction fields 

	public Cajero(String direccion) {
		super();
		this.direccion = direccion;
	}
	//getters y setters 

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//to string 

	@Override
	public String toString() {
		return "Cajero [direccion=" + direccion + "]";
	}
	//metodos nativos
	// comportamiento 
	//retirar, depositar, transferir
	public Ticket retirar (CuentaBancaria cuenta, double monto) {
		
		Ticket ticket = null;
		
		// validar que la cantidad no incluya monedas
		if(monto%50!=0 ) {
			System.out.println("La cantidad no incluye monedas");
			
		}else if (monto>cuenta.getSaldo()) {//validacion para confirmar que se tenga dinero suficiente
			System.out.println("Saldo insuficiente");
			
		}else if(cuenta.getMin()>cuenta.getSaldo()-monto) {
			System.out.println("El retiro dejaria por debajo del minimo");
		}else {
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			folio = folio+1;
			ticket= new Ticket(this.direccion, new Date(),folio , monto, cuenta.getNumCuenta());
			
		}
		
		
		
		return ticket;
		
	}
	public Ticket depositar(CuentaBancaria cuenta, double monto) {
		
		Ticket ticket = null;
		
		// validar que el monto no se pase del maximo	
		if (monto>cuenta.getMax()) {//validacion para confirmar que se tenga dinero suficiente
			System.out.println("El monto sobrepasa el maximo");
			
		}else if(cuenta.getMax()<cuenta.getSaldo()+monto) {
			System.out.println("El deposito llevaria por encima del maximo a la cuenta");
		}else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			folio = folio+1;
			ticket= new Ticket(this.direccion, new Date(),folio , monto, cuenta.getNumCuenta());
			
		}
		
		
		
		
		
	
		return ticket;
		
	}
	public Ticket transferir(CuentaBancaria original, CuentaBancaria destino, double monto) {
		
		Ticket ticket = null;
		
		if (monto>original.getSaldo()) {//validacion para confirmar que se tenga dinero suficiente
			System.out.println("Saldo insuficiente");
		}else if(original.getMin()>original.getSaldo()-monto) {
			System.out.println("La transferencia dejaria por debajo del minimo");
		}else if (monto>destino.getMax()) {//validacion para confirmar que se tenga dinero suficiente
			System.out.println("El monto supera la cantidad maxima que puede recibir la cuenta");
		}else if(destino.getMax()<destino.getSaldo()+monto) {
				System.out.println("El monto que desea tranferir llevaria por encima del maximo a la cuenta de destino");
		}else {
			original.setSaldo(original.getSaldo()-monto);
			destino.setSaldo(destino.getSaldo()+monto);
			folio = folio+1;
			ticket= new Ticket(this.direccion, new Date(), folio, monto, original.getNumCuenta(), destino.getNumCuenta());
		}
		
		return ticket;
		
	}
}
