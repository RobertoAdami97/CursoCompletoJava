package com.excript.aula040;

public class Aula040 {

	public static void main(String[] args) {
		
		System.out.println("Imprime os numeros pares de 0 a 10");
		for(int i = 0; i < 100; i++) {
//			if(i == 2 || i == 4 || i == 8)
//				continue;
//			System.out.println(i);
			
			if(i%2==0)
				System.out.println(i);
			else
				continue;
			int a = 0, soma = 0;
			
			while(a < i) {
				a++;
				soma+= a;
			}
			System.out.println("A soma de todos os números é: " + soma);
		}

	}

}
