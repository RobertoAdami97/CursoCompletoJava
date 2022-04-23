package com.excript.somatodosalgarismosrecursividade;

import java.util.Scanner;

public class SomaAlgarismosRecursividade {

	public static int somaAlgarismosC(int num) {
		if(num < 10) {
			return num;
		}else {
			return somaAlgarismosC(num/10)+num%10;
		}
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = in.nextInt();
		int soma = somaAlgarismosC(num);
		
		System.out.println("A soma dos algarismos é: " + soma);
	}

}
