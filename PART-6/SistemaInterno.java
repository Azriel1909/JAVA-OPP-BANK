
public class SistemaInterno {
	private String clave = "123456789";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesión = gerente.iniciarSesion(clave);
		if (puedeIniciarSesión) {
			System.out.println("Login exitoso.");
			return true;
		} else {
			System.out.println("Error en el login.");
			return false;
		}
	}
}
