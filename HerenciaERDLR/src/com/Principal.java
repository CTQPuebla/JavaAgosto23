package com;

public class Principal {

	public static void main(String[] args) {
		
		ClasePrueba cprueba= new ClasePrueba();
		cprueba.setValorA("hola");
		cprueba.setValorB(20);
		cprueba.setValorC(757.38);
		
		
		cprueba.imprimeAlgo();
		cprueba.invierteCadena("puebla");
		
		ClaseHija ch= new ClaseHija();
	ch.invierteCadena("puebla");
	 
	System.out.println(cprueba.multiplicar(6, 7));
	System.out.println(cprueba.multiplicar(6, 7));
	
	}
	
	
}
