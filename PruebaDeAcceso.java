
public class PruebaDeAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(33);
//		Se le asignó un valor a través del modificador de acceso
		cuenta.depositar(400);
		cuenta.retirar(300);
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
	}
}
