package com.pinkbank.test;

import java.util.ArrayList;

import com.pinkbank.modelo.Cliente;
import com.pinkbank.modelo.Cuenta;
import com.pinkbank.modelo.CuentaCorriente;

public class PruebaArrayList {
	public static void main(String[] args) {
//		Force it to accepts one type of Count.
//		Parameterizes this ArrayList to accepts one Object Type 
		ArrayList<Cuenta> lista = new ArrayList<>();
//				 Generic
//		Reference 		Object -> (HEAP)
		Cuenta cc = new CuentaCorriente(33, 333);
		Cuenta cc2 = new CuentaCorriente(44, 444);
		Cuenta cc3 = new CuentaCorriente(33, 333);
		
		lista.add(cc);
		lista.add(cc2);
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		System.out.println("Loop");
		
//		Return the elements's numbers (parameters) of the list
//		We do not know when it is empty
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
//		Objects ArrayList
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
//		Contains method: to know if there is an element in the list.
//		Returns a boolean data type
//		Reference comparison.
		boolean contiene = lista.contains(cc3);
		if (contiene) {
			System.out.println("Contiene el elemento.");
		} else {
			System.out.println("No contiene el elemento.");
		}
//		it does not save the Object, it saves the reference.
		
//		Information comparison (the values).
//		if (cc.esIgual(cc3)) {
//			System.out.println("Contienen la misma información.");
//		} else {
//			System.out.println("No contienen la misma información.");
//		}
	}
}
