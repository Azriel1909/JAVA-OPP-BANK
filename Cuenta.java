// Entidad Cuenta
public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
//	Para depositar (método que NO retorna valor)
	void depositar (double valor) {
//		Buena práctica para especificar los atributos
		this.saldo += + valor;
	}
//	Para retirar (método que retorna valor)	
	public boolean retirar (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= - valor;
			return true;
		} 
		return false;
	}
	
	public boolean transferir (double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
		}
		return false;
	}
	
}

// instancias - representaciones del objeto
