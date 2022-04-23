package com.excript.expressoeslambdasIII;


public class ExpressoesLambdasIII {

	interface Num {
		double getValue();
	}

	interface ValorNumerico {
		boolean teste(int n);
	}
	
	interface ValorNumerico2{
		boolean teste(int n, int n2);
	}

	public static void main(String[] args) {

		// Expressão lambda utilizada como uma constante
		Num n;
		n = () -> 555.11;
		System.out.println(n.getValue());

		// Utilização da classe math com a estrutura lambda
		Num n2;
		n2 = () -> Math.random() * 100;
		System.out.println(n2.getValue());
		System.out.println(n2.getValue());
		
		System.out.println();
		
		ValorNumerico isPar = (int i) -> (i % 2) == 0;
		System.out.println(isPar.teste(3));
		System.out.println(isPar.teste(4));
		
		System.out.println();
		
		ValorNumerico2 isDiv = (x, y) -> (x % y) == 0;
		System.out.println(isDiv.teste(10, 2));
		System.out.println(isDiv.teste(10, 3));
		
		ValorNumerico expressao1 = y -> (y % 2) == 0;
		ValorNumerico2 expressao2 = (x, y) -> (x % y) == 0;
		ValorNumerico2 expressao3 = (int x, int y) -> (x % y) == 0;
		
		ValorNumerico2 expressao4 = (int x, int y) -> {
			int w = x + y;
			return w > 1000;
		};
		
		System.out.println(expressao4.teste(22, 979));
		
	}

}
