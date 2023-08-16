package com;

public final class ClasePrueba {

	String valorA;
	int valorB;
	double valorC;
	
	public ClasePrueba() {
		
	}
	public ClasePrueba(String valorA, int valorB, double valorC) {
		super();
		this.valorA = valorA;
		this.valorB = valorB;
		this.valorC = valorC;
	}

	public String getValorA() {
		return valorA;
	}

	public void setValorA(String valorA) {
		this.valorA = valorA;
	}

	public int getValorB() {
		return valorB;
	}

	public void setValorB(int valorB) {
		this.valorB = valorB;
	}

	public double getValorC() {
		return valorC;
	}

	public void setValorC(double valorC) {
		this.valorC = valorC;
	}

	@Override
	public String toString() {
		return "ClasePrueba [valorA=" + valorA + ", valorB=" + valorB + ", valorC=" + valorC + "]";
	}
	
	/*
	 * Metodos nativos
	 * metodos heredados se sobrescriben
	 * Metodos implementados que son traidos de interfaces
	 * 
	 */
	
	public void imprimeAlgo() {
		System.out.println("mensaje aleatorio");
	}
	
	public void invertirCadena(String cadena) {
		String reversa= "";
		for (int i = cadena.length() - 1; i >= 0; i--) {
			reversa = reversa+ Character.toString(cadena.charAt(i));
		}
		
		System.out.println(reversa);
	}
	
	public final int multiplicar(int a, int b) {
		return a*b;
	}
	
	}
