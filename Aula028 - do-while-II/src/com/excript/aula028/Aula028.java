package com.excript.aula028;

import java.util.Scanner;

public class Aula028 {

	public static void main(String[] args) {
		
		int x = 0;
		double num1, num2, result;
		
		
		
		Scanner in = new Scanner(System.in);
		
		do {
			
			num1 = num2 = result = 0;
			
			System.out.println("Digite 1 para somar");
			System.out.println("Digite 2 para subtrair");
			System.out.println("Digite 3 para multiplicar");
			System.out.println("Digite 4 para dividir");
			System.out.println("Digite 0 para sair");
			System.out.println("Digite o código da operação desejada:");
			
			x = in.nextInt();
			
			if(x != 0) {
				
				System.out.println("Digite o primeiro numero:");
				num1 = in.nextDouble();
				
	
				System.out.println("Digite o segundo numero:");
				num2 = in.nextDouble();
				
				if(x==1) {
					result = num1 + num2;
				}else {
					if(x==2) {
						result = num1 - num2;
					} else {
						if(x==3) {
							result = num1 * num2;
						} else {
							if(x==4) {
								result = num1 / num2;
							}
						}
					}
				}
				
				System.out.println("Resultado: " + result);
			}
		
		}while(x!=0);
	}

}
