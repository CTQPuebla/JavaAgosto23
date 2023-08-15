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

	//Comportamiento
	//Retirar, depositar, transferir
	
	public Ticket retirar(CuentaBancaria cuenta, double monto) {
		Ticket ticket = null; 
		//validar que la cantidad no incluye monedas
		if(monto%50!=0 || monto%100!=0 || monto%200!=0 || monto%500!=0) {
			System.out.println("La cantidad no incluye monedas");
			}else if (monto>cuenta.getSaldo()) {
				System.out.println("Saldo insuficiente");
			}else if(cuenta.getMin()>cuenta.getSaldo()-monto) {
				System.out.println("El retiro dejaria por debajo del minimo de la cuenta");
			}else	{
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				
				ticket = new Ticket (this.direccion, new Date(), folio++, monto, cuenta.getNumCuenta());
				
			}
		return ticket;
		
	}
	
	public Ticket depositar(CuentaBancaria cuenta, double monto) {
		Ticket ticket = null;
		 if (monto>cuenta.getMax()) {
				System.out.println("El monto sobrepasa el maximo de la cuenta");
				
			}else if(cuenta.getMax()<cuenta.getSaldo()+monto) {
				System.out.println("El deposito llevaria por encima del maximo de la cuenta");
			}else	{
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				
				ticket = new Ticket (this.direccion, new Date(), folio++, monto, cuenta.getNumCuenta());
				
			}
		return ticket;
			
	}
	
	public Ticket transferir(CuentaBancaria origen, CuentaBancaria destino, double monto) {
		Ticket ticket = null; 
			   
			 if(origen.getSaldo()<monto) { //Validar que me alcance el dinero para la transferencia 
			   System.out.println("Fondos insuficientes"); 
			 }else if(origen.getMin()>origen.getSaldo()-monto) { 
			   System.out.println("La transferencia dejara por debajo del minimo a la cuenta origen"); 
			  }else if(destino.getMax()<monto) { 
			   System.out.println("El monto a transferir es mayor que el maximo permitido por la cuenta destino"); 
			  }else if(destino.getMax()<destino.getSaldo()+monto) { 
			   System.out.println("La transferencia llevaria por encima del maximo permitido a la cuenta destino"); 
			  }else { 
			   origen.setSaldo(origen.getSaldo()-monto); 
			   destino.setSaldo(destino.getSaldo()+monto); 
			    
			   ticket = new Ticket(this.direccion, 
			                 new Date(), 
			                 folio++, monto, origen.getNumCuenta(), destino.getNumCuenta()); 
			  } 
			  return ticket; 
			 
		}
		
		

		
		
	}
	
	
	

