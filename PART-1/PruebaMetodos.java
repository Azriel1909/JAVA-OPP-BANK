
public class PruebaMetodos {
// Para depositar en CUenta, necesita incrementar su saldo.
// Un método es una secuencia de pasoso para realizar una acción
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(1);
//		Cuenta hace referencia a cualquier cuenta (esto es general)
		miCuenta.depositar(900);
//		Depositamos un valor determinado
		miCuenta.depositar(200);
//		Ya se aplico el método
		System.out.println(miCuenta.getSaldo());
//		Sintaxis: nombreDeReferencia.nombreDelMetodo
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaDeXimena = new Cuenta(1);
		cuentaDeXimena.depositar(1000);
		cuentaDeXimena.transferir(400, miCuenta);
		System.out.println("Trasferencia");
		System.out.println(cuentaDeXimena.getSaldo());
		System.out.println(miCuenta.getSaldo());
	}
}
