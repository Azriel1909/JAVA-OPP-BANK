package com.pinkbank.test;

import com.pinkbank.modelo.CuentaAhorros;

public class PruebaString {
	public static void main(String[] args) {
		String nombreVariable = "Ximena";
//	  	String es un Objeto y nunca es alterado de ninguna forma.
		String nombreVariable2 = new String(" Toledo");
		
//		Forma no utilizada en el mundo real, pero, existe.
		System.out.println("Antes del método replace: " + nombreVariable);
		nombreVariable = nombreVariable.replace("X", "J");
//		Apuntando a una nueva referencia en un nuevo lugar de java
		System.out.println("Después del método replace: " + nombreVariable);
//		Concatenación
		nombreVariable = nombreVariable.concat(nombreVariable2);
		printLine("Después del método concat: " + nombreVariable);
		nombreVariable = nombreVariable2.toUpperCase();
		printLine("Después del método uppercase: " + nombreVariable);
		char letra = nombreVariable.charAt(1);
		printLine("Después del método charAt: " + letra);
		int indice = nombreVariable2.indexOf("o");
		printLine("Después del método indexOf: " + indice);
//		Método estatico: no necesita tener una instancia nueva de out para consumir println
		printLine(new CuentaAhorros(200, 300));
//		Referencia de memoria donde el objeto esta almacenado
	}
	
	public static void printLine(Object valor) {
		System.out.println(valor.toString());
	}
}
