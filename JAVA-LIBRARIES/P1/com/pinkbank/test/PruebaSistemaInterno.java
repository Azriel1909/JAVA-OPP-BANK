package com.pinkbank.test;

import com.pinkbank.modelo.Administrador;
import com.pinkbank.modelo.Gerente;
import com.pinkbank.modelo.SistemaInterno;

public class PruebaSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente);
		sistema.autentica(admin);
	}
}
