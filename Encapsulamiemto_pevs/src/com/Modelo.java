package com;

public class Modelo {
	
	private int x;
	protected String mesaje;
	public double decimal;
	 // metodo protected accesido
	
	
	public  Modelo(){
		
		
	}

	public Modelo(int x, String mesaje, double decimal) {
		super();
		this.x = x;
		this.mesaje = mesaje;
		this.decimal = decimal;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getMesaje() {
		return mesaje;
	}

	public void setMesaje(String mesaje) {
		this.mesaje = mesaje;
	}

	public double getDecimal() {
		return decimal;
	}

	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}

	@Override
	public String toString() {
		return "Modelo [x=" + x + ", mesaje=" + mesaje + ", decimal=" + decimal + "]";
	}
	protected void doSometing() {
		System.out.println("algo");
	}
}
	
		
	
