package com.excript.soma0a100;

public class SomaZeroACem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int soma = 0; 
		
//		for(int i = 1; i <= 100; i++) {
//			soma += i;
//		}
		
		int i = 0;
//		while(i <= 100) {
//			soma += i;
//			i++;
//		}
		
		do {
			soma += i;
			i++;
		}while(i <= 100);
		
		System.out.println(soma);
		
	}

}
