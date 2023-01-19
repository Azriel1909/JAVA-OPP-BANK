package com.pinkbank.modelo;

public abstract interface Autenticable {

	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);
}
