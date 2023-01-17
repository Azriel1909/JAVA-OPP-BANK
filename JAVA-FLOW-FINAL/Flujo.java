

// Pila de ejecución

public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fin main");
	}
	
	public static void m1() throws MiException {
		System.out.println("Inicio método 1");
		m2();
		System.out.println("Fin método 1");
	}
	
	public static void m2() throws MiException {
		System.out.println("Inicio método 2");
		throw new MiException("Mi excepción fue lanzada.");
//		throw new ArithmeticException(); // Explotar en este punto - Sentencia de muerte - no podemos tener más code debajo de throw
//		System.out.println("Fin método 2");
	}
}