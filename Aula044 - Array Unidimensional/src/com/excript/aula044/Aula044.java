package com.excript.aula044;

public class Aula044 {

	public static void main(String[] args) {
		
		int[] array;//declara��o do array
		
		array = new int[10];//cria e reserva o espa�o para o nosso array
		
		for(int i = 0; i <= 9; i++) {

			
			
			array[i] = (i == 9) ? 80 : 0;
			System.out.printf("%5d%7d\n", i, array[i]);

//			a linha abaixo funciona conforme a acima
//			%5d%7d servem para dar espa�o entre os valores do array e de i.
//			J� o \n serve para pular linhas e o printf � para reconhecer os comandos
			
//			System.out.println(i + "     " + array[i]);
		}
		
		
	}

}
