package com.pinkbank.modelo;

public class GuardaReferencias {
	Object[] referencia = new Object[19];
	int indice = 0;
//	Add a x object
	public void adicionar(Object cc) {
		referencia[indice] = cc;
		indice++;
	}
	
	public Object obtener(int indice) {
		return referencia[indice];
	}
}
