package com.excript.aula046;

public class Aula046 {

	public static void main(String[] args) {

		int[] array = {18, 22, 43, 14, 95};
		
		//System.out.printf("%s%10s\n", "Indice", "Valores");
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d\n", i, array[i]);
		}
		
	}

}
