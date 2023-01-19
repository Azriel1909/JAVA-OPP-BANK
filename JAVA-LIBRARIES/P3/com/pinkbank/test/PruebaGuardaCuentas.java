package com.pinkbank.test;

import com.pinkbank.modelo.Cuenta;
import com.pinkbank.modelo.CuentaCorriente;
import com.pinkbank.modelo.GuardaCuentas;

public class PruebaGuardaCuentas {
	public static void main(String[] args) {
		GuardaCuentas guardaCuentas = new GuardaCuentas();
		Cuenta cc1 = new CuentaCorriente(11, 111);
		guardaCuentas.adicionar(cc1);
		Cuenta cc2 = new CuentaCorriente(22, 222);
		guardaCuentas.adicionar(cc2);
		
		System.out.println(guardaCuentas.obtener(0));
		System.out.println(guardaCuentas.obtener(1));
	}
}
