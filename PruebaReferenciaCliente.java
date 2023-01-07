
public class PruebaReferenciaCliente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Xime");
		cliente1.setDocumento("009009");
//		¿Cómo crear la referencia? -> Checar archivo Cuenta.java
		Cuenta cuenta1 = new Cuenta(1);
		cuenta1.setTitular(cliente1);;
//		Confirmación de referencia
		System.out.println(cuenta1.getTitular().getDocumento());
		System.out.println(cuenta1.getTitular());
		System.out.println(cliente1);
	} // ! Warning (do not delete)
}
