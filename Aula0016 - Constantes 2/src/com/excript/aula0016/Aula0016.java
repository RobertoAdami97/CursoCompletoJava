package com.excript.aula0016;

import java.util.Scanner;

public class Aula0016 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final double vsom = 340.28;// m/s
		
		System.out.println("Digite o espaço de tempo: ");
		
		int tempo = in.nextInt();
		
		System.err.println("A distância seria de " + tempo * vsom + " metros percorridos.");
		
		System.err.println("A distância em KM " + (tempo * vsom) / 1000 + " metros percorridos.");
		
	}

}
