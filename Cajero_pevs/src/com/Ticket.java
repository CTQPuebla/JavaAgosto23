package com;

import java.util.Date;

public class Ticket {
 String ubicacion;
 Date fechaHora;
 int folio;
 double monto;
 String cuentaOrigen;
 String cuentaDedestino;


 public Ticket() {
	 
 }
 
public Ticket(String ubicacion, Date fechaHora, int folio, double monto, String cuentaOrigen, String cuentaDedestino) {
	
	this.ubicacion = ubicacion;
	this.fechaHora = fechaHora;
	this.folio = folio;
	this.monto = monto;
	this.cuentaOrigen = cuentaOrigen;
	this.cuentaDedestino = cuentaDedestino;
	
}

public Ticket (String ubicacion, Date fechaHora, int folio, double monto, String numCuenta) {
		
		this.ubicacion = ubicacion;
		this.fechaHora = fechaHora;
		this.folio = folio;
		this.monto = monto;
		this.cuentaOrigen = numCuenta;
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



public String getCuentaOrigen() {
	return cuentaOrigen;
}



public void setCuentaOrigen(String cuentaOrigen) {
	this.cuentaOrigen = cuentaOrigen;
}



public String getCuentaDedestino() {
	return cuentaDedestino;
}



public void setCuentaDedestino(String cuentaDedestino) {
	this.cuentaDedestino = cuentaDedestino;
}



@Override
public String toString() {
	return "Ticket [ubicacion=" + ubicacion + ", fechaHora=" + fechaHora + ", folio=" + folio + ", monto=" + monto
			+ ", cuentaOrigen=" + cuentaOrigen + ", cuentaDedestino=" + cuentaDedestino + "]";
}

}



