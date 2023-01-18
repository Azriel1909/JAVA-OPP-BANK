
public class ControlBonificacion {
	private double suma;
	
//	Sobrecarga de método, método con el mismo nombre pero diferentes algumentos.
//	Polimorfismo: Creamos una única puerta de entrada para todos aquellos elementos que sean Funcionarios.
//	Funcinario es el tipo más genérico
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Suma actual: " + this.suma);
		return this.suma;
	}
}
