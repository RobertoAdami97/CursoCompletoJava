package com.excript.aula0009;

import java.util.Scanner;

public class Aula0009 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, subtracao, multi, divi;
		System.out.println("Insira um numero: ");
		num1 = in.nextDouble();
		System.out.println("Insira o segundo numero: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma é: " + soma);
		
		subtracao = num1 - num2;
		System.out.println("O resultado da subtração é: " + subtracao);
		
		multi = num1 * num2;
		System.out.println("O resultado da multiplicação é: " + multi);
		
		divi = num1 / num2;
		System.out.println("O resultado da divisão é: " + divi);
		
		
	}

}
