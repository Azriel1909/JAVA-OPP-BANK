package com.pinkbank.modelo;

public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);	
	}

	@Override
	public void depositar(double valor) {
		super.saldo = super.saldo + valor;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
