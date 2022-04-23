package com.excript.aula034;

import java.util.Random;

public class Aula034 {

	public static void main(String[] args) {
		
		Random num = new Random();
		for(int i = 0; i <= 10; ++i) {
//			System.out.println(num.nextInt(6)+1);
//			System.out.println(num.nextDouble()*50+20);
			//50 é o valor maximo e 20 é o minimo
			System.out.println(num.nextBoolean());
			//0..5
			//é impresso do numero 1 ate o 5
		}
		
	}

}
