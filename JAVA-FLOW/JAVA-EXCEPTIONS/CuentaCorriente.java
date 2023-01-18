
public class CuentaCorriente extends Cuenta {
	public CuentaCorriente (int agencia, int numero) {
		super(agencia, numero);
//		Super accede a los métodos de la clase padre y llama al construstor que utiliza dichos paramétros.
	}

	@Override
	public void remover(double valor) throws saldoInsuficienteException {
//		El método es sobreescrito, firma de métodos.
		double comision = 0.2;
		super.remover(valor + comision);
	}
	
	@Override
	public void depositar(double valor) {
	}
}
