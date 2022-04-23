package com.excript.aula058;

public class Aula058 {

	public static void main(String[] args) {
		
		int[][] valores = new int[5][5];
		
		for(int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++) {
				valores[x][y] = 9;
				
				System.out.print(valores[x][y] + " ");

			}
			
			System.out.println();
		}
		
	}

}
