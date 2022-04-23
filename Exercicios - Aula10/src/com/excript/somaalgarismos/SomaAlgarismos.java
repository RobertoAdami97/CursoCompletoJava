package com.excript.somaalgarismos;

import java.util.Scanner;


public class SomaAlgarismos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe um numero:");
		int num = in.nextInt();
		
		int soma = 0;
		
		while(num > 0) {
			soma += (num % 10);
			num /= 10;
			System.out.println("O valor de soma é: " + soma);
		}
		
		System.out.println("A soma dos algarismos é: " + soma);
		
	}

}
