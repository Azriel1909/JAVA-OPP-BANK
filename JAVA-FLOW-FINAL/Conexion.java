
public class Conexion implements AutoCloseable {
//	simular la conexión con una base de datos
	public Conexion() {
	       System.out.println("Abriendo conexion de BD.");
	       
	   }

	   public void leerDatos() {
	       System.out.println("Recibiendo de BD.");
	       throw new IllegalStateException();
//	       Conexión no exitosa.
	   }

	   public void cerrar() {
	       System.out.println("Cerrando conexion de BD.");
	   }

	@Override
	public void close() throws Exception {
		cerrar();
	}
}
