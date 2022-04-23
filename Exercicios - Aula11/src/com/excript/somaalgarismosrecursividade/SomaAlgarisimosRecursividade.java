package com.excript.somaalgarismosrecursividade;

import java.util.Scanner;

public class SomaAlgarisimosRecursividade {


public static int somaAlgarismos(int num, int somaMomentanea) {
	
	if(num < 1) {
		return somaMomentanea;
	}else {
		somaMomentanea += num % 10;
	}
	return somaAlgarismos(num/10, somaMomentanea);
	
}

	
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numero = in.nextInt();
		
		int soma = somaAlgarismos(numero, 0);
		
		System.out.println("O valor da soma dos algarismos é: " + soma);
		
	}

}
