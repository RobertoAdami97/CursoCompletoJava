package com.excript.interfacesfuncionais;

public class InterfacesFuncionais {
	
	//metodo abstrado
	interface Num{
		double getValue();
	}
	
	public static void main(String[] args) {

		Num n;
		
		//funcao lambda
		n = () -> 333.11;
		
		System.out.println(n.getValue());
		
	}

}
