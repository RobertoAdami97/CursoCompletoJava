package com.excript.aula032;

import java.util.Scanner;

public class Aula032 {

	public static void main(String[] args) {
		
		short i = 1;
		
		if(1 == 1) {
			double x = 1;// A variavel x est� no escopo do bloco de codigo abaixo, pos isso
			// � visualizada s� neste escopo
		}
		
		{
			System.out.println("Pau no cu do putin");;
		}
		
		//System.out.println(x);
	}

}
