package com.excript.aula036;

import java.util.Scanner;

public class Aula036 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual o seu dia da semana predileto");
		System.out.println("Digite 1 para segunda ou 7 para domingo");
		int num = in.nextInt();
		
		String dia = (num==1) ? "segunda" :
					 (num==2) ? "Terça" :
					 (num==3) ? "Quarta" :
					 (num==4) ? "Quinta" :
				     (num==5) ? "Sexta" :
				     (num==6) ? "Sabado" :
				     (num==7) ? "Domingo" :
				              "Dia Invalido";
		
//		switch(num) {
//			case 1: dia = "Segunda";
//			case 2: dia = "Terça";
//			case 3: dia = "Quarta";
//			case 4: dia = "Quinta";
//			case 5: dia = "Sexta";
//			case 6: dia = "Sabado";
//			case 7: dia = "Domingo";
//			default: dia = "Dia Invalido";
//		}
//		
		System.out.println(dia);
	}

}
