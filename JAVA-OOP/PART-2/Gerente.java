
public class Gerente extends Funcionario {
//					extiende de
	private String clave;
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "pelota15";
	}
	
//	Sobreescritura de método en la clase hija
	public double getBonificacion() {
		return super.getSalario() + super.getBonificacion();
//			   super = tomamos métodos de la clase padres
		
		
	}
}
