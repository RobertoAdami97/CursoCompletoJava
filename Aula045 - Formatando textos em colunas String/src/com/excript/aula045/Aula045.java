package com.excript.aula045;

public class Aula045 {

	public static void main(String[] args) {
		
		int [] array;
		
		array = new int[10];
		
		//funciona tanto com %s quanto com %10s
		System.out.printf("%s%s\n", " ________", " _________ ");
		System.out.printf("%s%10s\n", "| Indice ", "| Valores |");
		System.out.printf("%s%10s\n", "|--------", "|---------|");
		
		for(int i = 0; i <= 9; i++) {
			
			
			System.out.printf("|%5d   |%7d  |\n", i, array[i]);
			
		}
		System.out.printf("%s%10s\n", "|________", "|_________|");
		
	}

}
