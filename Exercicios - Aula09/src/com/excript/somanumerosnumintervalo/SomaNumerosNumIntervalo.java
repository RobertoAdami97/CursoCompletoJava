package com.excript.somanumerosnumintervalo;

import java.util.Scanner;

public class SomaNumerosNumIntervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
//		int i = 0;
		int valorInicio = 0;
		
		System.out.println("Digite um número para o inicio da contagem:");
		int i = in.nextInt();
		
		System.out.println("Digite um número para o final da contagem:");
		int numeroFinal = in.nextInt();
		
		int soma = 0;
		for(valorInicio = i; valorInicio <= numeroFinal; valorInicio++) {
			soma += valorInicio;
		}
		
		System.out.println(soma);
		
		
	}

}
