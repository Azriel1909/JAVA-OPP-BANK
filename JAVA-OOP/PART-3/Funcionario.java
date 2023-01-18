
public class Funcionario {
	private String nombre;
	private String documento;
	private double salario;
	private int tipo;
//	Herencia: Escribir un sólo método y reutilizarlo en sus clases hijas.
//	constructor es un método público que su retorno es la clase en sí
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
	
	public double getBonificacion() {
//		Si tipo = 1 es gerente
//		Si tipo = 0 es funcionario 
//		if(this.tipo == 0) {
//			return this.salario*0.1;
//		} else if (this.tipo == 1) {
//			return this.salario;
//		} else {
//			return 0;
//		} // Pésima práctica
		return this.salario*0.05;
	}

//	Modificadores de visibilidad de menor a mayor visibilidad private < protected < public
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
