package org.jmmartinez.itacademy.curso01Ejercicio1;

public class Employee{
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(int empId, String name, String ssn, double salary){
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public int getEmpId(){
		return this.empId;
	}
	public String getName(){
		return this.name;
	}
	public String getSsn(){
		return this.ssn;
	}
	public void raiseSalary(double increase){
		this.salary+=increase;
	}
	
}