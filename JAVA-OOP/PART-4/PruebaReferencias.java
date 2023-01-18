
public class PruebaReferencias {
	public static void main(String[] args) {
		
//		Elemento más genérico puede ser adaptado al elemento más específico
//		Elemento genérico (Funcionario) y elemento especifíco (Gerente)
		Funcionario funcionario = new Gerente();
//		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("Conratt");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Ariel");
//		Asiganción con los setters
		funcionario.setSalario(5000);
		funcionario.setSalario(10000);
		
		
	}
}
