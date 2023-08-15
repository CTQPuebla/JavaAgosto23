package com;

import java.util.Date;

public class CuentaBancaria {

	String numcuenta;
	double saldo;
	String titular;
	Date fechaapertura;
    double min;
    double max;
    String tipocuenta;
    
    public CuentaBancaria() {
    	
    	
    }

	public CuentaBancaria(String numcuenta, double saldo, String titular, Date fechaapertura, double min, double max,
			String tipocuenta) {
		super();
		this.numcuenta = numcuenta;
		this.saldo = saldo;
		this.titular = titular;
		this.fechaapertura = fechaapertura;
		this.min = min;
		this.max = max;
		this.tipocuenta = tipocuenta;
		
	
	}

	public String getNumcuenta() {
		return numcuenta;
	}

	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
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

	public Date getFechaapertura() {
		return fechaapertura;
	}

	public void setFechaapertura(Date fechaapertura) {
		this.fechaapertura = fechaapertura;
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

	public String getTipocuenta() {
		return tipocuenta;
	}

	public void setTipocuenta(String tipocuenta) {
		this.tipocuenta = tipocuenta;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numcuenta=" + numcuenta + ", saldo=" + saldo + ", titular=" + titular
				+ ", fechaapertura=" + fechaapertura + ", min=" + min + ", max=" + max + ", tipocuenta=" + tipocuenta
				+ "]";
	}
	
	
}



