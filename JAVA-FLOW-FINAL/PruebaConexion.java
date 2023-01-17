
public class PruebaConexion {
	public static void main(String[] args) throws Exception {
//		Try con recursos: permite abrir un objeto y automáticamente cerrarlo
		try (Conexion conexion = new Conexion()) {
			conexion.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Ejecutando Catch.");
			ex.printStackTrace();
		}
		
		/* Try/Catch Tradicional
		 *  Un try nunca esta solo, puede tener catch o finally(un sólo finally y primero debe usarse catch)
		Conexion conexion = null;
		try {
			conexion = new Conexion();
			conexion.leerDatos();
		} catch (IllegalStateException ex) {
			System.out.println("Se recibe la exception.");
			ex.printStackTrace();
		} finally {
			System.out.println("Ejecutando finally.");
			if (conexion != null) {
				conexion.cerrar();
			}
		}
		*/
	}
}
