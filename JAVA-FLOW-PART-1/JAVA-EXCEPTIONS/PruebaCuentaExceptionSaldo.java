
public class PruebaCuentaExceptionSaldo {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.depositar(210);
		try {
			cuenta.remover(2100);
		} catch (saldoInsuficienteException e) {
			e.printStackTrace();
		}
	}
}
