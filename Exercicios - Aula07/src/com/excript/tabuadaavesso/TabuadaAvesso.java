
package com.excript.tabuadaavesso;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class TabuadaAvesso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado = 0;

		System.out.printf("Esolha o número da tabuada.\n"
				+ "EX: 1 para tabuada de 1 e 6 para a tabuada de 6. E assim sucessivamente:");
		int tabuada = new Scanner(System.in).nextInt();
		
		for (int i = 10; i >= 1; i--) {
			
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
			//foi burrice usar o switch case
//			switch (tabuada) {
//			case 1:
//				resultado = 1 * i;
//				break;
//			case 2:
//				resultado = 2 * i;
//				break;
//			case 3:
//				resultado = 3 * i;
//				break;
//			case 4:
//				resultado = 4 * i;
//				break;
//			case 5:
//				resultado = 5 * i;
//				break;
//			case 6:
//				resultado = 6 * i;
//				break;
//			case 7:
//				resultado = 7 * i;
//				break;
//			case 8:
//				resultado = 8 * i;
//				break;
//			case 9:
//				resultado = 9 * i;
//				break;
//			case 10:
//				resultado = 10 * i;
//				break;
//			default:
//				System.out.println("Número inválido! Escolha uma número de 0 à 10");
//			}

//			System.out.printf("%d x %d = %d\n", tabuada, i, resultado);

		}

	}

}
