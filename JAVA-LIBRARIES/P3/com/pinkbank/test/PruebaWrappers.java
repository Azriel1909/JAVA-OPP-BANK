package com.pinkbank.test;

public class PruebaWrappers {
	public static void main(String[] args) {
//		Autoboxing
		Double numeroDoble = 99.0;
		System.out.println(numeroDoble);
		Boolean verdadero = true;
		System.out.println(verdadero);
		
//		Static method
		Double numeroDoble2 = Double.valueOf(99);
		System.out.println(numeroDoble2);
		
		String numeroString  = "49";
//		Autoboxing: String num = new String("49")
		Double stringToDouble = Double.valueOf(numeroString);
		Integer stringToInteger = Integer.valueOf(numeroString);
		System.out.println("Double: " + stringToDouble);
		System.out.println("Entero: " + stringToInteger);
		Number numero = Integer.valueOf(5);
		
		double numeroDoublePrimitivo = numero.doubleValue(); //Unboxing
		Boolean falso = Boolean.FALSE;
		
	}
}
