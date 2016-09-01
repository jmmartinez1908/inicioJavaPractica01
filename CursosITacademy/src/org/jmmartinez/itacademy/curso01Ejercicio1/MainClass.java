package org.jmmartinez.itacademy.curso01Ejercicio1;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Engineer eng = new Engineer(101,"jose Manuel", "3333_54353_345",120345.27);
		Manager man = new Manager(201,"Manuel", "2222__345",109345.27, "informatica");
		Admin adm = new Admin(301,"martinez", "11111_54353_345",75345.27);
		Director dir = new Director(401,"arevalo", "55555_58787_345",130987.27,"Desarrollo y arq",100000.10);
	}

}
