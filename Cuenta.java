// Entidad Cuenta
public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
//	Referencia
	private Cliente titular = new Cliente(); // Nuestro objeto no es manipulade a menos que se haga desde nuestros métodos
	private static int total = 0; // Esto significa que la vaiable no es de la instancia sino de la clase, las instancia es "new Objeto()";
//	No se puede acceder a nivel de instancia sino de clase
//	Construstor: El método manipula el objeto
	
	public Cuenta(int agencia) {
//		Método que retoran el objeto cuenta
		if(agencia <= 0) {
			System.out.println("No se permiten valores negativos o un valor 0.");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se creó creando: " + total + " número de cuentas.");
	}
	
//	Para depositar (método que NO retorna valor)
	void depositar (double valor) {
//		Buena práctica para especificar los atributos
		this.saldo += valor;
	}
//	Para retirar (método que retorna valor)	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
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

	public double getSaldo() {
//		para obtener el valor de una variable privada
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

// instancias - representaciones del objeto
