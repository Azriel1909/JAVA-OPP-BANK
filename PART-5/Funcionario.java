// Una clase abstracta - representación conceptual pero no física (no podemos crear un objeto a partir de esta clase abstracta)
public abstract class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;

	public Funcionario() {
		
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
//	Definiendo métodos abstractos (método libre)
	public abstract double getBonificacion();
//	No tiene cuerpo, sólo definen firma.

// private < protected < public
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
