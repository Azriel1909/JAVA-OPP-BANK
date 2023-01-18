package com.pinkbank.test;

public class PruebaMain {
	public static void main(String[] args) {
//	modificador + HEAP + no retorna valor + método principal + Objeto String + [] Arreglo + argumentos
	
		int[] edades = new int[5];
//		Almacenar valores dentro del arreglo
//		Indices - todos los arreglos comienzan en la posicion 0
		edades[2] = 30;
		System.out.println(edades[0]);
		System.out.println(edades[1]);
		System.out.println(edades[2]);
//		Arreglo - Estructura de datos
//		System.out.println(edades[5]);
		int tamanioArreglo = edades.length;
		System.out.println("El tamaño del arreglo es: " + tamanioArreglo);
		for(int i = 0; i < tamanioArreglo; i++) {
			System.out.println("Número: " + edades[i]);
		}
		
	}
}
