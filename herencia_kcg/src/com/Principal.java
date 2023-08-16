package com;

public class Principal {

	public static void main(String[] args) {
		
		ClasePrueba cprueba = new ClasePrueba();
		
		cprueba.setValorA("Hola");
		cprueba.setValorB(10);
		cprueba.setValorC(762.38);
		
		cprueba.imprimeAlgo();
		cprueba.invertirCadena("puebla");
		
		ClaseHija ch = new ClaseHija();
		
		//ch.invertirCadena("puebla");
		
		ch.setCiertoFalso(false);
		
		System.out.println(cprueba.multiplicar(6, 8));
		System.out.println(ch.multiplicar(6, 8));
	}
}
