
public class PruebaMetodos {
// Para depositar en CUenta, necesita incrementar su saldo.
// Un método es una secuencia de pasoso para realizar una acción
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
//		Cuenta hace referencia a cualquier cuenta (esto es general)
		miCuenta.saldo = 900;
//		Depositamos un valor determinado
		miCuenta.depositar(200);
//		Ya se aplico el método
		System.out.println(miCuenta.saldo);
//		Sintaxis: nombreDeReferencia.nombreDelMetodo
		miCuenta.retirar(100);
		System.out.println(miCuenta.saldo);
		
		Cuenta cuentaDeXimena = new Cuenta();
		cuentaDeXimena.depositar(1000);
		cuentaDeXimena.transferir(400, miCuenta);
		System.out.println("Trasferencia");
		System.out.println(cuentaDeXimena.saldo);
		System.out.println(miCuenta.saldo);
	}
}
