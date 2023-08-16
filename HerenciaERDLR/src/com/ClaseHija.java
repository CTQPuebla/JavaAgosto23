package com;

public class ClaseHija extends ClasePrueba {

	//Mas Atributos
	boolean ciertofalso;
	
	public ClaseHija() {

	
	
	}

	public ClaseHija(boolean ciertofalso) {
	
		this.ciertofalso = ciertofalso;
	}

	public boolean isCiertofalso() {
		return ciertofalso;
	}

	public void setCiertofalso(boolean ciertofalso) {
		this.ciertofalso = ciertofalso;
	
			
		}
		@Override
		public int multiplicar(int a, int b) {
			System.out.println("mensaje desde la clase hija");
			int resultado =0;
	for (int i = 1; i <=b; i++) {
         resultado = resultado + a;
	}
	return resultado;
		}	
}
