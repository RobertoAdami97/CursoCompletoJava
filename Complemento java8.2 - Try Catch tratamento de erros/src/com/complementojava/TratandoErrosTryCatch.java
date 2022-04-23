package com.complementojava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratandoErrosTryCatch {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		
		try {
			int n = ler.nextInt();
			System.out.println(30/n);
		} catch(InputMismatchException erro) {
			System.out.println("Você só pode informar números inteiros " + erro);
		} catch(ArithmeticException erro) {
			System.out.println("Nenhum numero pode ser dividido por zero: " + erro);

//		o finally serve pra terminar a execução do try independente se ocorreu erro ou nao
			
		} finally {
			System.out.println("FIM");
		}
	}

}
