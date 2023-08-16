package com;

public class ClaseHija {
	
	boolean ciertoFalso;
	public ClaseHija() {
		
	}
	public ClaseHija(boolean ciertoFalso) {
		this.ciertoFalso = ciertoFalso;
	}
	public boolean isCiertoFalso() {
		return ciertoFalso;
	}
	public void setCiertoFalso(boolean ciertoFalso) {
		this.ciertoFalso = ciertoFalso;
	}
	
	public int multiplicar(int a, int b) {
		System.out.println("Metdo desde la clase hija");
		int sum = 0;
		for(int i=0; i<b; i++) {
			sum+= a;
		}
		return sum;
	}
	
	@Override
	public String toString() {
		return "ClaseHija [ciertoFalso=" + ciertoFalso + "]";
	}
	
	
	
	

}
