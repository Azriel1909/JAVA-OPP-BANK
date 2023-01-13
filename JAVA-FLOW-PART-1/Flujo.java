

// Pila de ejecución

public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		m1();
		System.out.println("Fin main");
	}
	
	public static void m1() {
		System.out.println("Inicio método 1");
		m2();
		System.out.println("Fin método 1");
	}
	
	public static void m2() {
		System.out.println("Inicio método 2");
		for (int i = 1; i<=5; i++) {
			System.out.println(i);
			
		}
		System.out.println("Fin método 2");
	}
}