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
	
	//Retirar,depositar,transferir
	
	
	//METODOS
	public Ticket retirar(CuentaBancaria cuenta,double monto) {//pasamos el argumento cuenta
		//devuelvo un objeto de tipo Ticket(es una clase)
		
		
		Ticket ticket = null;
		
		//Validar que la cantidad no incluya monedas
		if(monto %50!=0 ) {
			
			System.out.println("La cantidad no incluye monedas");
			
		}else if(monto > cuenta.getSaldo()) {//valida que tenga suficiente saldo o dinero
			
			System.out.println("Saldo insuficiente");
			
		}else if(cuenta.getMin()>cuenta.getSaldo()-monto) {//aunque me alcance ,pero que no me deje el retiro por debajo del mínimo
			
			System.out.println("El retiro dejaría por debajo del mínimo a la cuenta");
			
		}else {
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			
			folio+=1;
			ticket = new Ticket(this.direccion,
					            new Date(),
					             folio,
					             monto,
					             cuenta.getNumCuenta());		
		}
			
		return ticket;		
	}
	
	
	
	public Ticket depositar(CuentaBancaria cuenta,double monto) {
		
		Ticket ticket = null;
		//1000
		 if(monto > cuenta.getMax()) {
			
			System.out.println("El monto sobrepasa el maximo de la cuenta");
			
		}else if(cuenta.getMax()<cuenta.getSaldo()+monto) {
			
			System.out.println("El deposito llevaría por encima del maximo a la cuenta");
			
		}else {
			
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			folio+=1;
			ticket = new Ticket(this.direccion,
					            new Date(),
					             folio,
					             monto,
					             cuenta.getNumCuenta());
			
		}
			
		return ticket;
	}
	
	
	public Ticket transferir(CuentaBancaria origen,CuentaBancaria destino,double monto) {
		
		//origen es un objeto de la clase CuentaBancaria
		
		Ticket ticket = null;
		
		//1000 >500
		if(monto > origen.getSaldo()) {
			
			System.out.println("Saldo insuficiente");
			
		}else if(origen.getMin()>origen.getSaldo()-monto) {//100  > 500-450 = 50
				
			System.out.println("La transfernecia dejaría por debajo del mínimo a la cuenta");	
			
		}else if(destino.getMax() < destino.getSaldo()+monto){//2000  < 1500+1000
			
			System.out.println("La transfernecia llevaría por encima del maximo a la cuenta");
			
		}
		
		else {
				
	       origen.setSaldo(origen.getSaldo()-monto);//1000-400=600;
	        destino.setSaldo( destino.getSaldo() +monto);
	        folio+=1;
			ticket = new Ticket(this.direccion,new Date(),folio,monto,origen.getNumCuenta(), destino.getNumCuenta());			
		}
		
		return ticket;
		
	}
//	public Ticket transferir(CuentaBancaria origen, CuentaBancaria destino, double monto) { 
//		  Ticket ticket = null; 
//		   
//		  if(origen.getSaldo()<monto) { //Validar que me alcance el dinero para la transferencia 
//		   System.out.println("Fondos insuficientes"); 
//		  }else if(origen.getMin()>origen.getSaldo()-monto) { 
//		   System.out.println("La transferencia dejara por debajo del minimo a la cuenta origen"); 
//		  }else if(destino.getMax()<monto) { 
//		   System.out.println("El monto a transferir es mayor que el maximo permitido por la cuenta destino"); 
//		  }else if(destino.getMax()<destino.getSaldo()+monto) { 
//		   System.out.println("La transferencia llevaria por encima del maximo permitido a la cuenta destino"); 
//		  }else { 
//		   origen.setSaldo(origen.getSaldo()-monto); 
//		   destino.setSaldo(destino.getSaldo()+monto); 
//		    
//		   ticket = new Ticket(this.direccion, 
//		                 new Date(), 
//		                 folio++, monto, origen.getNumCuenta(), destino.getNumCuenta()); 
//		  } 
//		  return ticket; 
//		 }
//	
	

}
