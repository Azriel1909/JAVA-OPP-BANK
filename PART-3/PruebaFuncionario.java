
public class PruebaFuncionario {
	public static void main(String[] args) {
		Funcionario ximena = new Funcionario();
		ximena.setNombre("Ximena Toledo");
		ximena.setDocumento("123456789");
		ximena.setSalario(2000);
		ximena.setTipo(0);
		System.out.println(ximena.getNombre());
		System.out.println(ximena.getDocumento());
		System.out.println(ximena.getSalario());
		
//		El constructor es llamado en la inicialización del objeto y los constructores por default son aquellos que no reciben parámetros.
		System.out.println("BONIFICACIÓN FUNCIONARIO");
		System.out.println(ximena.getSalario());
		System.out.println(ximena.getBonificacion());
	}
}
