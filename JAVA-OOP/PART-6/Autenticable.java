
public abstract interface Autenticable {
//	Las interfaces no tienen métodos implementados

//	La interfaz todos los métodos son abstractos
	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);
}
