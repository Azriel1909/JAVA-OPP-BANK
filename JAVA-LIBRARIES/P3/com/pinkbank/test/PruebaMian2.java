package com.pinkbank.test;

public class PruebaMian2 {
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		int[] edades = new int[5];
		edades[2] = 30;
//		The array size is a constructor. 
		System.out.println(edades[0]);
		System.out.println(edades[1]);
		System.out.println(edades[2]);

		int tamanioArreglo = edades.length;
		System.out.println("El tamaño del arreglo es: " + tamanioArreglo);
		for(int i = 0; i < tamanioArreglo; i++) {
			System.out.println("Número: " + edades[i]);
		}
	}
}
