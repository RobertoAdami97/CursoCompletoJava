package com.excript.aula026;

public class Aula026 {

	public static void main(String[] args) {
		//Operadores de incremento
		
		int i = 0;
		int y = 0;
		
		//Operador de pré incremento
		System.out.println(++i);
		i += 1;
		
		//Operador de pós incremento
		System.out.println(y++);
		System.out.println(y);
		i += 1;
		
		//Operadores de decremento
		
		int a = 0;
		int b = 0;
		
		System.out.println(" ----------- ");
		a--;
		System.out.println(--a);//PRE DECREMENTO
		
		b--;
		System.out.println(b--);//POS DECREMENTO
		System.out.println(a);
		
		int u = 0;
		
		u = u + 1;//Forma Tradicional
		u += 1;//Operador de Atribuição
		++u;//Operador de Incremento

	}

}
