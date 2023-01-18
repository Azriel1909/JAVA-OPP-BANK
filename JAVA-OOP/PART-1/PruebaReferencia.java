
public class PruebaReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(1); // Se reserva un espacio de la memoria para ese objeto
		primeraCuenta.depositar(300);
		
		Cuenta segundaCuenta = new Cuenta(1);
		segundaCuenta.depositar(100);
	
		System.out.println("Saldo de cuenta 1: " + primeraCuenta.getSaldo());
		System.out.println("Saldo de cuenta 2: " + segundaCuenta.getSaldo());
		
		segundaCuenta.depositar(500);
		System.out.println("Saldo de cuenta 1: " + primeraCuenta.getSaldo());
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
