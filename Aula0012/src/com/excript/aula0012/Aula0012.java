package com.excript.aula0012;

import java.util.Scanner;

public class Aula0012 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double num1, num2, num3, num4, soma, media;
		
		System.out.println("Digite a sua nota: ");
		num1 = in.nextDouble();
		
		System.out.println("Digite a sua segunda nota: ");
		num2 = in.nextDouble();
		

		System.out.println("Digite a sua terceira nota: ");
		num3 = in.nextDouble();
		

		System.out.println("Digite a sua quarta nota: ");
		num4 = in.nextDouble();
		
		soma = num1 + num2 + num3 + num4;
		media = soma / 4;
		
		
		
		if(media >= 7) {
			System.out.println("Voce foi Aprovado!");
			System.out.println("A sua media foi: " + media);
		}else {
			System.out.println("Voce foi Reprovado!");
			System.out.println("A sua media foi: " + media);
		}
		
	}

}
