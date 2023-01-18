package com.pinkbank.test;
import com.pinkbank.modelo.Gerente;

public class PruebaGerente {
	public static void main(String[] args) {
//		package + classname
		Gerente gerente = new Gerente();
//		gerente.setSalario(5000);
//		Funcionario gerente = new Funcionario();
		gerente.setSalario(6000);
		gerente.setTipo(1);
		System.out.println("BONIFICACIÓN GERENTE");
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("pelota15"));
	}
}
