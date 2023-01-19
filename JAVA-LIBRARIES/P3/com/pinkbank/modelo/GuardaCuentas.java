package com.pinkbank.modelo;

public class GuardaCuentas {
	
//	Create and object to save counts (a lot instances of Cuenta).
//	Add Counts with a method.
	Cuenta[] cuenta = new Cuenta[19];

	int indice = 0;
// 	[	|	|	|	|...|	]
	public void adicionar(Cuenta cc) {
		// Method that adds counts to an array
		cuenta[indice] = cc;
		indice++;
	}
	
	public Cuenta obtener (int indice) {
		return cuenta[indice];
	}
}
