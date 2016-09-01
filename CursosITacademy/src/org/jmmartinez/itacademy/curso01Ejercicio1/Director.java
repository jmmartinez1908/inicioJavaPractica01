package org.jmmartinez.itacademy.curso01Ejercicio1;

public class Director extends Manager {
	private double budget;
	
	public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
		super(empId, name, ssn, salary, deptName);
		this.budget = budget;
	}
	
	public double getBudget(){
		return this.budget;
	}

}
