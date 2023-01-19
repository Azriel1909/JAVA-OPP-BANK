package com.pinkbank.test;
// país + nombre de la empresa + model/service
import com.pinkbank.modelo.Contador;
import com.pinkbank.modelo.ControlBonificacion;
import com.pinkbank.modelo.Funcionario;
import com.pinkbank.modelo.Gerente;
// importación: traer clases de otros paquetes, las importaciones van despúes de los paquetes


public class PruebaControlBonificacion {
	public static void main(String[] args) {
		Funcionario funcionario = new Contador();
		funcionario.setSalario(2000);
		
		Gerente gerente = new Gerente();
		gerente.setSalario(10000);
		
		Contador contador = new Contador();
		contador.setSalario(5000);
		
//		Apllicación de Polimorfismo: la clase acepta culaquier objeto
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(funcionario);
		controlBonificacion.registrarSalario(gerente);
		controlBonificacion.registrarSalario(contador);
//		Resumen: Cuando tenemos el método tando en la clase padre como en la hija, llama al método más específico
		
		
	}
}
