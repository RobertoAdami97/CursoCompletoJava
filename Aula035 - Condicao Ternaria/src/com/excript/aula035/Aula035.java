package com.excript.aula035;

public class Aula035 {

	public static void main(String[] args) {
		
		String valor;
		int i, a, b;
		a = 6;
		b = 5;
		
//		if(a == b)
//			valor = "verdadeiro";
//		else
//			valor = "falso";
		
		valor = (a < b) ? "verdadeiro" : "falso";
		
		valor = (a < b) || (a == b) ? "verdadeiro" : "falso";
		
		System.out.println(valor);
		
//		i = true ? 40 : 50;
//		
//		System.out.println(i);
		
	}

}
