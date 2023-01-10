
public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(225);
		System.out.println(cuenta.getAgencia());
		Cuenta cuenta1 = new Cuenta(335);
		Cuenta cuenta2 = new Cuenta(445);
		Cuenta cuenta3 = new Cuenta(555);
//		se necesita validación
		System.out.println("Cuentas totales...");
		System.out.println(Cuenta.getTotal());
	}
}
