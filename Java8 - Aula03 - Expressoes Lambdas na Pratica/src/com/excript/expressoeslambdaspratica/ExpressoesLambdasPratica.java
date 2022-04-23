package com.excript.expressoeslambdaspratica;

public class ExpressoesLambdasPratica {

	public static void main(String[] args) {

		System.out.println("Inicio do teste");
		
		//Implementa��o da classe anonima Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Estudando a express�o lambda 1.");
			}
		};
		
		
		Runnable r2;
		r2 = () //Lista de argumentos
			 -> //Seta - uma forma de demarcar que estamos trabalhando com express�o lambda
			 System.out.println("Estudando a express�o lambda 2.");//Corpo
		
		r1.run();
		r2.run();
		
	}

}
