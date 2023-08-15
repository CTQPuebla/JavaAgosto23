package com;

import java.util.Date;

public class Ticket {
	
	String ubicacion;
	Date fechaHora;
	int folio;
	double monto;
	String cuentaOriginal;
	String cuentaDestino;
	
	public Ticket() {
		
	}

	public Ticket(String ubicacion, Date fechaHora, int folio, double monto, String cuentaOriginal,
			String cuentaDestino) {
		super();
		this.ubicacion = ubicacion;
		this.fechaHora = fechaHora;
		this.folio = folio;
		this.monto = monto;
		this.cuentaOriginal = cuentaOriginal;
		this.cuentaDestino = cuentaDestino;
	}
	public Ticket(String ubicacion, Date fechaHora, int folio, double monto, String cuentaOriginal) {
		super();
		this.ubicacion = ubicacion;
		this.fechaHora = fechaHora;
		this.folio = folio;
		this.monto = monto;
		this.cuentaOriginal = cuentaOriginal;
	}
		
 
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getCuentaOriginal() {
		return cuentaOriginal;
	}

	public void setCuentaOriginal(String cuentaOriginal) {
		this.cuentaOriginal = cuentaOriginal;
	}

	public String getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	@Override
	public String toString() {
		return "Ticket [ubicacion=" + ubicacion + ", fechaHora=" + fechaHora + ", folio=" + folio + ", monto=" + monto
				+ ", cuentaOriginal=" + cuentaOriginal + ", cuentaDestino=" + cuentaDestino + "]";
	}
	

}
