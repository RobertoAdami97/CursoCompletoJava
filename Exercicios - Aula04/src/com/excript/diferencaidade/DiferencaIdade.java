package com.excript.diferencaidade;

import java.util.Scanner;

public class DiferencaIdade {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int idadeFilho = 0, 
			idadeMae = 0, 
			diferencaIdade = 0;
		
		System.out.print("Digite a sua idade:");
		idadeFilho = in.nextInt();
		System.out.println();
		System.out.print("Digite a idade da sua m�e:");
		idadeMae = in.nextInt();
		
		
		System.out.println();
		System.out.print("A sua idade �: " + idadeFilho);
		System.out.println();
		System.out.println("A idade da sua m�e �: " + idadeMae);
		
		diferencaIdade = idadeMae - idadeFilho;
		
		System.out.printf("A minha m�e � %d anos mais velha do que eu.", diferencaIdade);
		System.out.println();
		String teste = "funcionou";
		System.out.printf("Isso � uma teste com %s", teste);
		
		in.close();
		
	}

}
