
public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);	
	}

	@Override
	public void depositar(double valor) {
		super.saldo = super.saldo + valor;
	}
}