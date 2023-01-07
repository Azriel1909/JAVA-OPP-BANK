
public class CrearCuenta {
	public static void main(String[] args) {
//		Lo que deseamos crear
		Cuenta primeraCuenta = new Cuenta();
//		primeraCuenta es una instancia del objeto Cuenta
		primeraCuenta.saldo = 900;
		primeraCuenta.agencia = 1;
		primeraCuenta.numero = 90909;
		primeraCuenta.titular = "Ximena";
		System.out.println("Primera cuenta");
		System.out.println(primeraCuenta.saldo);
//		Los datos se inicializan automáticamente
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 1000;
		System.out.println("Segunda cuenta");
		System.out.println(segundaCuenta.saldo);

	}
}
