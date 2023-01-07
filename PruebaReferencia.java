
public class PruebaReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(); // Se reserva un espacio de la memoria para ese objeto
		primeraCuenta.saldo = 300;
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 100;
	
		System.out.println("Saldo de cuenta 1: " + primeraCuenta.saldo);
		System.out.println("Saldo de cuenta 2: " + segundaCuenta.saldo);
		
		segundaCuenta.saldo += 500;
		System.out.println("Saldo de cuenta 1: " + primeraCuenta.saldo);
//		Ambos objetos apuntan a la misma dirección de la memoria
		
		System.out.println(primeraCuenta);
//		Muetra un tipo de objeto y la ubicación de la memoria del objeto
		System.out.println(segundaCuenta);
//		se verifica que se referencia a la misma ubicación de la memoria
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Mismo objeto.");
			System.out.println(primeraCuenta);
			System.out.println(segundaCuenta);
		} else {
			System.out.println("Diferente objeto.");
			System.out.println(primeraCuenta);
			System.out.println(segundaCuenta);
		}
		
	}
}
