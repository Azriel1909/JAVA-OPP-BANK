
public class CrearCuenta {
	public static void main(String[] args) {
//		Lo que deseamos crear
		Cuenta primeraCuenta = new Cuenta(2);
//		primeraCuenta es una instancia del objeto Cuenta
		primeraCuenta.depositar(900);
		System.out.println("Primera cuenta");
		System.out.println(primeraCuenta.getSaldo());
//		Los datos se inicializan automáticamente
		Cuenta segundaCuenta = new Cuenta(2);
		segundaCuenta.depositar(1000);
		System.out.println("Segunda cuenta");
		System.out.println(segundaCuenta.getSaldo());
	}
}
