
public class Administrador extends Funcionario implements Autenticable {
//	El administrador es FUncionario (existe herencia)
	@Override
	public double getBonificacion() {
		return 0;
	}
	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
