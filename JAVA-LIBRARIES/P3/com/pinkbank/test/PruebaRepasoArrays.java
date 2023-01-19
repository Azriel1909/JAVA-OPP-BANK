package com.pinkbank.test;

import java.util.ArrayList;
import java.util.List;

public class PruebaRepasoArrays {
	public static void main(String[] args) {
		int[] numeros = new int [10];
	
		int numero = 40;
//		Wrapper
		
//		Integer numeroObjeto = new Integer(40); // Deprecated
		Integer numeroObjeto = Integer.valueOf(40); // number to object
		
//		Object and Object
		List<Integer> Lista = new ArrayList<>(); 
//		Primitives(saves values) != Objects(saves references)
		Lista.add(numero); // Autoboxing lista.add (new Integer(40))
		Lista.add(numeroObjeto);
		
//		Unboxing
//		int valorPrimitivo = numeroObjeto;
		int valorPrimitivo = numeroObjeto.intValue();
//											Unboxing(Extracts the value, takes the object and turns it to primitive)
		
		byte byteInteger = numeroObjeto.byteValue();
		double doubleInteger = numeroObjeto.doubleValue();
		float floatInteger = numeroObjeto.floatValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); //Bits
		System.out.println(Integer.BYTES);
		
	}
}
