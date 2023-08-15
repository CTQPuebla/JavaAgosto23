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

	// Comportamiento
	// Retirar, depoositar, transferiif()

	public Ticket retirar(CuentaBancaria cuenta, double monto) {

		Ticket ticket = null;
		// Validar que la cuenta no incluya monedas
//		if (monto % 50 != 0 || monto % 100 != 0 || monto % 200 != 0 || monto % 500 != 0) {
//			System.out.println("La cantidad no incuye monedas");
		if (monto > cuenta.getSaldo()) {
			System.out.println("Saldo insuficiente");
		} else if (cuenta.getMin() > cuenta.getSaldo()) {
			System.out.println("El retiro por debajo el minimo de la cuenta");
		} else {
			cuenta.setSaldo(cuenta.getSaldo() - monto);
			folio=folio+1;
			ticket = new Ticket(this.direccion, new Date(), folio, monto, cuenta.getNumCuenta());
		}
		return ticket;
	}

	// Depositar
	public Ticket depositar(CuentaBancaria cuenta, double monto) {

		Ticket ticket = null;
		if (monto >= cuenta.getMax()) {
			System.out.println("Sobre pasa el maximo de la cuenta");
			ticket = new Ticket(this.direccion, new Date(), folio++, monto, cuenta.getNumCuenta());
		} else if (cuenta.getMax() < cuenta.getSaldo() + monto) {
			System.out.println("El deposito llevara por encima el monto maximo permitido");
		} else {
			cuenta.setSaldo(cuenta.getSaldo() + monto);
			folio=folio+1;
			ticket = new Ticket(this.direccion, new Date(), folio, monto, cuenta.getNumCuenta());
		}

		return ticket;
	}

	// Transferir
	public Ticket trasnferir(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, double monto) {

		Ticket ticket = null;
		if (monto > cuentaOrigen.getSaldo()) {
			System.out.println("Tu saldo es insuficiente");
		}else if(cuentaOrigen.getMin()>cuentaOrigen.getSaldo()-monto) {
			System.out.println("la trsnferencia dejara por debajo el minimo");
		} else if (monto > cuentaDestino.getMax()) {
			System.out.println("Sobre pasa el monto maximo de la cuenta a depositar del receptor");
		} else if (cuentaDestino.getMax() < cuentaDestino.getSaldo() + monto) {
			System.out.println("El deposito excedera el monto maximo permitido");
		} else {
			// Actualizar nuevo saldo
			folio=folio+1;
			cuentaOrigen.setSaldo(cuentaDestino.getSaldo() - monto);
			cuentaDestino.setSaldo(cuentaDestino.getSaldo() + monto);
			ticket = new Ticket(this.direccion, new Date(), folio, monto, cuentaOrigen.getNumCuenta(),
					cuentaDestino.getNumCuenta());
		}

		return ticket;
	}
}
