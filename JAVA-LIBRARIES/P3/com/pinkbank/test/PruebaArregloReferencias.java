package com.pinkbank.test;

import com.pinkbank.modelo.Cliente;
//import com.pinkbank.modelo.Cuenta;
import com.pinkbank.modelo.CuentaAhorros;
import com.pinkbank.modelo.CuentaCorriente;

public class PruebaArregloReferencias {
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(25, 45);
//		[new|cc	|null|null|null]
		Object[] referencias = new Object[5];
		referencias[1] = cc;
//		Se guarda cualquier tipo de objeto.
		
//		El valor apunta al mismo objeto, hace una referencia al mismo objeto
		System.out.println("Objeto: " + cc);
		System.out.println("Objeto: " + referencias[1]);
		
		referencias[0] = new CuentaCorriente(99, 9);
		System.out.println(referencias[0]);
		
		CuentaAhorros ca = new CuentaAhorros(01, 02);
		referencias[3] = ca;
		
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		
		Cliente obtenido = (Cliente)referencias[4];
		System.out.println("Cliente: " + obtenido);
		
		for (int i = 0; i < referencias.length;i++ ) {
			System.out.println("cuenta: " + referencias[i]);
		}
		
//		Casting - Cast - indicar del tipo determinado - convertir de un tipo a otro.
		CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
		System.out.println("Cliente: " + cuenta);
		
		
		
		
		
		
	}
}
