package com.excript.aula024;

public class Aula024 {

	public static void main(String[] args) {
		
		//Precedencia de operadores
		
		/*
		 * +
		 * -
		 * *
		 * /
		 * % - resto da divisão
		 */
		
		int a, b, c;
		a = 15;
		b = 10;
		c = 5;
		
		int y = 0;
		
		y = a + b;
		y = a - b;
		y = a * b;
		y = a / b;
		
		y = a % b;
		
		//System.out.println(a * (b - c));
		
		//System.out.println(a - b / a - b);
		
		System.out.println(
				(((((((b + c)+1+((((((((((1000*10))))))))))))))))/1000/10-1
				);
		
	}

}
