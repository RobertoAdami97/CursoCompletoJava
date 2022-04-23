package com.excript.aula048;

public class Aula048 {

	public static void main(String[] args) {

		int[] arrayInt = new int[10];
		arrayInt[0] = 10;
		arrayInt[1] = 20;
		arrayInt[2] = 30;
		arrayInt[3] = 11;
		arrayInt[4] = 19;
		arrayInt[5] = 22;
		arrayInt[6] = 89;
		arrayInt[7] = 41;
		arrayInt[8] = 71;
		arrayInt[9] = 1;
		
//		int soma = arrayInt[0]+arrayInt[1]+arrayInt[2];
//		System.out.println("A soma dos três primeiros elementos é: " + soma);
		
		int soma2 = 0;
		for(int i = 0; i < 10; i++) {
			soma2 += arrayInt[i];
		}
		System.out.println("A soma de todos os elementos é: " + soma2);
	}

}
