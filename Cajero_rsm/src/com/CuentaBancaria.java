package com;

import java.util.Date;

public class CuentaBancaria {

	String numCuenta="";
	double fondo;
	String titular="";
	Date fechaApertura;
	
	double min;
	double max;
	String tipoCuenta;
	double saldo;
	
	public CuentaBancaria () {
		
	}

	

	public CuentaBancaria(String numCuenta, double saldo, String titular, Date fechaApertura, double min, double max,
			String tipoCuenta) {
		super();
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.titular = titular;
		this.fechaApertura = fechaApertura;
		this.min = min;
		this.max = max;
		this.tipoCuenta = tipoCuenta;
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getFondo() {
		return fondo;
	}

	public void setFondo(double fondo) {
		this.fondo = fondo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Date getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", fondo=" + fondo + ", titular=" + titular
				+ ", fechaApertura=" + fechaApertura + ", min=" + min + ", max=" + max + ", tipoCuenta=" + tipoCuenta
				+ ", saldo=" + saldo + "]";
	}

	
	
}
