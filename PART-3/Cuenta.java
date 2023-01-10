
public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;

	private Cliente titular = new Cliente();
	private static int total = 0;
	
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta.");
		Cuenta.total++;
	}
	

	void depositar (double valor) {

		this.saldo += valor;
	}

	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
	}
	
	public boolean remover (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transferir (double valor, Cuenta destino) {
		if (this.saldo >= valor) {
			this.remover(valor);
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
}


