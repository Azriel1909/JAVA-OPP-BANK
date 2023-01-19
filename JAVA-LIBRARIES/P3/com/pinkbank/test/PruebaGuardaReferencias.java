package com.pinkbank.test;

import com.pinkbank.modelo.Cuenta;
import com.pinkbank.modelo.CuentaCorriente;
import com.pinkbank.modelo.GuardaReferencias;

public class PruebaGuardaReferencias {
	public static void main(String[] args) {
		GuardaReferencias guardaReferencias = new GuardaReferencias();
		Cuenta cc1 = new CuentaCorriente(11, 111);
		guardaReferencias.adicionar(cc1);
		Cuenta cc2 = new CuentaCorriente(22, 222);
		guardaReferencias.adicionar(cc2);
		
		System.out.println(guardaReferencias.obtener(0));
		System.out.println(guardaReferencias.obtener(1));
	}
}
