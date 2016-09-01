package org.jmmartinez.itacademy.curso02;

public class Empleado {
	private int idEmp;
	private String nombre;
	
	public String getBasicInfo(){
		return "Id del empleado es: " + this.idEmp + " . Su nombre es: " + this.nombre;
	}
}
