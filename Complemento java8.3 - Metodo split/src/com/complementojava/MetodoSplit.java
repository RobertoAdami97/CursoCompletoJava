package com.complementojava;

public class MetodoSplit {

	public static void main(String[] args) {
		
		String nome = "Roberto-Carlos-Adami";
		
		String[] nomes = nome.split("-",3);
		
//		for(int i = 0; i < nomes.length; i++){
		
			System.out.print(nomes[0]);
			
//		}
		
	}

}
