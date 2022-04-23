package com.excript.aula0017;

import java.util.Scanner;

public class Aula0017 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int iJ, iI;
		iJ = 17;
		iI = 60;
		// mais de 17 anos e menos de 60;

		System.out.println("Digite sua idade: ");
		int idade = in.nextInt();
		
		if(idade <= iJ) {
			System.out.println("A idade da pessoa informada é de um jovem.");
		}else {
			if(idade >= iI) {
				System.out.println("A idade é de uma pessoa idosa.");
			}else {
				if(idade > iJ & idade < iI) {
					System.out.println("É uma pessoa de meia idade.");
				}
			}
		}
	}

}
