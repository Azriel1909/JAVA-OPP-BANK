
public class pruebaReferenciaCuentaCliente {
	public static void main(String[] args) {
		Cuenta cuenta01 = new Cuenta(2);
		Cliente cliente01 = new Cliente();
		cuenta01.setTitular(cliente01);
		cliente01.setNombre("Ximena");
//		cuenta1.titular.nombre = "Ximena";
//		Exception: los valores de objetos no inicializados son NULL 
//		titular inicializado
//		La implementación interna se puede modificar sin afectar ningún código fuera de la clase misma.
		System.out.println(cuenta01.getTitular().getNombre());
	}
}
