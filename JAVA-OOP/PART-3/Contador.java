
public class Contador extends Funcionario {
//	Sobre escritura
	@Override
	public double getBonificacion() {
		System.out.println("Ejecutando desde clase Contador...");
		return 200;
	}
}
