package com;

import java.util.Date;

public class CuentaBancaria {

	String numCuenta;
	double saldo;
	String titular;
	Date fechadeApertura;
	double min;
	double max;
	String tipoCuenta;
	
	public CuentaBancaria() {
		}
	public CuentaBancaria(String numCuenta, double saldo, String titular, Date fechadeApertura, double min, double max,
			String tipoCuenta) {
		
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.titular = titular;
		this.fechadeApertura = fechadeApertura;
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
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Date getFechadeApertura() {
		return fechadeApertura;
	}
	public void setFechadeApertura(Date fechadeApertura) {
		this.fechadeApertura = fechadeApertura;
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
	@Override
	public String toString() {
		return "CuentaBancaria [numCuenta=" + numCuenta + ", saldo=" + saldo + ", titular=" + titular
				+ ", fechadeApertura=" + fechadeApertura + ", min=" + min + ", max=" + max + ", tipoCuenta="
				+ tipoCuenta + "]";
	}
	
	
	
	
	
}
