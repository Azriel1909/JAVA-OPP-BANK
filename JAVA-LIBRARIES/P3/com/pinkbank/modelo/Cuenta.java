package com.pinkbank.modelo;

/**
 * The Cuenta class creates new instances like CuentaCorriente and CuentaAhrros.
 * @version 1.0
 * @author Ximena Toledo
 */

public abstract class Cuenta implements Comparable<Cuenta>{
	protected double saldo;
	private int agencia;
	private int numero;

	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
/**
 * @param agencia
 * @param numero
 */
	
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta: " + numero);
		Cuenta.total++;
	}

	public abstract void depositar(double valor);

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
	}
	
/**
 * The remover method throws an exception.
 * @param valor
 * @throws saldoInsuficienteException
 */
	
	public void remover(double valor) throws saldoInsuficienteException {
		if (this.saldo < valor) {
			throw new saldoInsuficienteException("Saldo insuficiente en la cuenta.");
		}
		this.saldo -= valor;
	}

	public boolean transferir (double valor, Cuenta destino) {
		if (this.saldo >= valor) {
			try {
				this.remover(valor);
			} catch (saldoInsuficienteException e) {
				e.printStackTrace();
			}
			destino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {

		return this.saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
	@Override
	public String toString() {
		String cuenta  = "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Titular: " + this.titular.getNombre();
		return cuenta;
	}
	
//	To evaluate information instead of references
//	public boolean esIgual(Cuenta cuenta) {
//		return this.agencia == cuenta.getAgencia() &&
//				this.numero == cuenta.getNumero();
//	}

//	the same logic as the esIgual method.
	@Override
	public boolean equals(Object obj) {
		Cuenta cuenta = (Cuenta) obj;
		return this.agencia == cuenta.getAgencia() &&
				this.numero == cuenta.getNumero();
	}
	
	@Override
	public int compareTo(Cuenta o) {
//		Natural Order by Agencia numbers
		return Integer.compare(this.agencia, o.getAgencia());
//		Natural Order by Money
//		return  Double.compare(this.saldo, o.getSaldo());
		
	}
}


