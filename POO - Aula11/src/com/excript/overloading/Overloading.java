package com.excript.overloading;

class Sobrecarga{
	
	void imprime(String s) {
		System.out.println(s);
	}
	
	void imprime(String s1, String s2) {
		System.out.println(s1 + " - " + s2);
	}
	
	void imprime(String s1, int i1) {
		System.out.println(s1 + " - " + i1);
	}
	
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Sobrecarga().imprime("Um parametro do tipo String");
		new Sobrecarga().imprime("Primeiro parametro" + ", Segundo parametro");
		new Sobrecarga().imprime("A idade é de ", 24);
		
//		Sobrecarga scarga1 = new Sobrecarga();
//		Sobrecarga scarga2 =  new Sobrecarga();
//		Sobrecarga scarga3 = new Sobrecarga();
		
	}

}
