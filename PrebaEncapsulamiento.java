
public class PrebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1);
		Cliente cliente = new Cliente();
		cliente.setNombre("Xime");
		cliente.setDocumento("09090909");
		cuenta.setTitular(cliente);
		System.out.println(cliente.getNombre());
//		The get method returns the variable value, and the set method sets the value.
		System.out.println(cuenta.getTitular().getNombre());
//		Comprobar espacio en la memoria del objeto
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());
//		Es el mismo
	}
}
