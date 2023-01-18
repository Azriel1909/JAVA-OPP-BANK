
public class CuentaCorriente extends Cuenta {
	public CuentaCorriente (int agencia, int numero) {
		super(agencia, numero);
//		Super accede a los métodos de la clase padre y llama al construstor que utiliza dichos paramétros.
	}
//	Confirmación del método
	@Override
	public boolean remover(double valor) {
//		El método es sobreescrito, firma de métodos.
		double comision = 0.2;
		return super.remover(valor + comision);
	}
}
