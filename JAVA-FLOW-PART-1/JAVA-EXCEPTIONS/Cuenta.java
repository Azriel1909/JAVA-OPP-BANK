
public abstract class Cuenta {
//	accesible desde sus clase hijas
//	No se puede instanciar clases abstractas
	protected double saldo;
	private int agencia;
	private int numero;
//	hola soy ximena toledo

	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta.");
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
				// TODO Auto-generated catch block
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
}


