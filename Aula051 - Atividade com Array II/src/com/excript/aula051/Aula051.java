package com.excript.aula051;

import java.util.Arrays;
import java.util.Scanner;

public class Aula051 {

	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		int resultado = 0, i = 0, multi = 0, maior = 0, 
		menor = 0, valorFinal = 0, valorMenor = 999999999;//Integer.MAX_VALUE
		double media = 0;
		
		for(; i < arr.length; i++){
			System.out.printf("Informe um numero da posição [%d]:", i+1);
			arr[i] = in.nextInt();
			
			
			
			if( arr[i] > maior) {
				maior = arr[i];
				valorFinal = maior;
			}else {
				valorFinal = maior;
			}
			
			
			
			if( arr[i] < valorMenor ) {
				menor = arr[i];
				valorMenor = menor;
			}else {
				valorMenor = menor;
			}
			
			
			resultado += arr[i];
			
			
		}
		
		for(int x = 0; x < arr.length; x++) {
			multi = (arr[x] * x);
			System.out.printf("A multiplicação do indice pelo valor %d * %d = %d \n",
					          x, arr[x], multi);
		}
		
		System.out.println("-----------------------------------");
		System.out.println(Arrays.toString(arr));
		System.out.println("O resultado da soma de todos os valores é: " + resultado);
		media = resultado / i;
		System.out.println("A média aritmética de todos os valores é: " + media);
		
		System.out.println("O maior elemento do array de i é: " + valorFinal);
		System.out.println("O menor elemento do array de i é: " + valorMenor);

		in.close();
		
	}

}
