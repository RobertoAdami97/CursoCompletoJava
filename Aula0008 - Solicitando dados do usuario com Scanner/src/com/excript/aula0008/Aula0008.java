package com.excript.aula0008;

import java.util.Scanner;

public class Aula0008 {

	public static void main(String[] args) {
		
		System.out.println("Informe a idade do seu dog: ");
		Scanner in = new Scanner(System.in);
		
		int idadeCachorro = in.nextInt();
		idadeCachorro = idadeCachorro * 7;
		
		System.out.println("O seu cachorro tem " + idadeCachorro + " anos.");
		
	}	
	
}
