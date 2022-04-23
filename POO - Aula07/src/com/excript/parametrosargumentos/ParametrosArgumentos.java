package com.excript.parametrosargumentos;

class Calculo{
		
	void soma(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
}


public class ParametrosArgumentos {

	public static void main(String[] args) {
		
		Calculo cal = new Calculo();
		cal.soma(2,22);
		
	}
	
}
