package com.excript.aula0010;


import java.util.Scanner;

public class Aula0010 {

	public static void main(String[] args) {
		
		int num = 11;
		
		System.out.println("Digite o n�mero 1!");
		
		Scanner ent = new Scanner(System.in);
		
		num = ent.nextInt();
		
		if (num==1) {
			System.out.println("Obrigado por digitar o " + num);
		}else {
			System.out.println("O numero digitado n�o � igual a 1");
		}
		
		/*if (num == 10) {
			System.out.println("Sim, � igual!");
		} else {
			System.out.println("N�o � igual!");
		}
		*/

	}

}
