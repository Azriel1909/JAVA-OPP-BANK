
public class PruebaControlBonificacion {
	public static void main(String[] args) {
		Funcionario funcionario = new Contador();
		funcionario.setSalario(2000);
		
		Gerente gerente = new Gerente();
		gerente.setSalario(10000);
		
		Contador contador = new Contador();
		contador.setSalario(5000);
		
//		Aplicación de Polimorfismo: la clase acepta cualquier objeto
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(funcionario);
		controlBonificacion.registrarSalario(gerente);
		controlBonificacion.registrarSalario(contador);
//		Resumen: Cuando tenemos el método tanto en la clase padre como en la hija, llama al método más específico
		
		
	}
}
