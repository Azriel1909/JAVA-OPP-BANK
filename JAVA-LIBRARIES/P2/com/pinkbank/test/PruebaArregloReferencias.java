package com.pinkbank.test;

import com.pinkbank.modelo.CuentaCorriente;

public class PruebaArregloReferencias {
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(25, 45);
//		[new|cc	|null|null|null]
		CuentaCorriente[] cuentas = new CuentaCorriente[5];
		cuentas[1] = cc;
//		el valor apunta al mismo objeto, hace una referencia al mismo objeto
		System.out.println(cc);
		System.out.println(cuentas[1]);
		cuentas[0] = new CuentaCorriente(99, 9);
		System.out.println(cuentas[0]);
		for (int i = 0; i < cuentas.length;i++ ) {
			System.out.println("cuenta: " + cuentas[i]);
			
		}
		
	}
}
