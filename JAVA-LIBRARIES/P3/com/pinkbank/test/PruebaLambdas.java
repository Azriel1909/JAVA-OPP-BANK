package com.pinkbank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.pinkbank.modelo.Cliente;
import com.pinkbank.modelo.Cuenta;
import com.pinkbank.modelo.CuentaCorriente;

/**
 * 
 * @author ximena
 *
 */

public class PruebaLambdas {
	public static void main(String[] args) {
		Cuenta cc1 = new CuentaCorriente(34,111);
		Cliente clientecc1 = new Cliente();
		clientecc1.setNombre("Dante");
		cc1.setTitular(clientecc1);
		cc1.depositar(999.0);
		
		Cuenta cc2 = new CuentaCorriente(16,222);
		Cliente clientecc2 = new Cliente();
		clientecc2.setNombre("Conratt");
		cc2.setTitular(clientecc2);
		cc2.depositar(1000.0);
		
		Cuenta cc3 = new CuentaCorriente(80,333);
		Cliente clientecc3 = new Cliente();
		clientecc3.setNombre("Schrondiger");
		cc3.setTitular(clientecc3);
		cc3.depositar(400.0);
		
		Cuenta cc4 = new CuentaCorriente(12,444);
		Cliente clientecc4 = new Cliente();
		clientecc4.setNombre("Toledano");
		cc4.setTitular(clientecc4);
		cc4.depositar(900.0);
		
		Cuenta cc5 = new CuentaCorriente(10,555);
		Cliente clientecc5 = new Cliente();
		clientecc5.setNombre("Gerad");
		cc5.setTitular(clientecc5);
		cc5.depositar(2000.0);
		
		List<Cuenta> listaCuentas = new ArrayList<>();
		listaCuentas.add(cc1);
		listaCuentas.add(cc2);
		listaCuentas.add(cc3);
		listaCuentas.add(cc4);
		listaCuentas.add(cc5);
		
		System.out.println("Antes del ordenamiento.");
		for(Cuenta cuenta : listaCuentas) {
			System.out.println(cuenta);
		}
		
//		Lambdas: functional programming
		listaCuentas.sort((Cuenta o1, Cuenta o2) -> 
			Integer.compare(o1.getNumero(), o2.getNumero())
		);
		
		System.out.println("Después del ordenamiento.");
		for(Cuenta cuenta : listaCuentas) {
			System.out.println(cuenta);
		}
		
		
//		Titular
		Collections.sort(listaCuentas,(c1, c2) -> 
			c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre())
		);
		
		System.out.println("Después del ordenamiento por nombre del titular.");
		for(Cuenta cuenta : listaCuentas) {
			System.out.println(cuenta);
		}

		listaCuentas.forEach((Cuenta cuenta) -> System.out.println(cuenta));
//		Consumer: a functional interface
		
//		Natural Order
		Collections.sort(listaCuentas);
		System.out.println("Después del ordenamiento natural.");
		for(Cuenta cuenta : listaCuentas) {
			System.out.println(cuenta);
		}
	}
}
