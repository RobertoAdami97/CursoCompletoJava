package com.excript.expressoeslambdas;

public class ExpressoesLambdasII {
	
	interface Num{
		double getValue();
	}
	
	interface ValorNumerico{
		boolean teste(int n);
	}

	public static void main(String[] args) {
		
		//Expressão lambda utilizada como uma constante
		Num n;
		n = () -> 555.11;
		System.out.println(n.getValue());
		
		//Utilização da classe math com a estrutura lambda
		Num n2;
		n2 = () -> Math.random() * 100;
		System.out.println(n2.getValue());
		System.out.println(n2.getValue());
		
		ValorNumerico isPar = (int i) -> (i % 2) == 0;
		System.out.println(isPar.teste(3));
		System.out.println(isPar.teste(4));
		
	}

}
