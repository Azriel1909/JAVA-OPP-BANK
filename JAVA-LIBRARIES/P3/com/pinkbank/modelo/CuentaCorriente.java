package com.pinkbank.modelo;

public class CuentaCorriente extends Cuenta {
	public CuentaCorriente (int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void remover(double valor) throws saldoInsuficienteException {

		double comision = 0.2;
		super.remover(valor + comision);
	}
	
	@Override
	public void depositar(double valor) {
	}
}
