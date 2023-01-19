package com.pinkbank.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.pinkbank.modelo.Cuenta;
import com.pinkbank.modelo.CuentaCorriente;

public class PruebaArrayList2 {
	public static void main(String[] args) {
		
//		List<Cliente> listaClientes = new LinkedList<>();
		
//								Thread safe
		List<Cuenta> lista = new ArrayList<>();
//		Specifies the data type  		(optional)
		Cuenta cc = new CuentaCorriente(33, 333);
		Cuenta cc2 = new CuentaCorriente(44, 444);
		Cuenta cc3 = new CuentaCorriente(33, 333);

		lista.add(cc);
		lista.add(cc2);
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);

		System.out.println("Loop");

		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}


		boolean contiene = lista.contains(cc3);
		if (contiene) {
			System.out.println("Contiene el elemento.");
		} else {
			System.out.println("No contiene el elemento.");
		}
	}
}
