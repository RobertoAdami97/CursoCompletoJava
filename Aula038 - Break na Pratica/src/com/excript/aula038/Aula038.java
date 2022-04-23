package com.excript.aula038;

public class Aula038 {

	public static void main(String[] args) {
		//labelForI é o nome do looping, isso server 
		//para podermos acessar o looping externo pelo interno
		labelForI: 
			for(int i = 0; i < 10; i++) {
			//if(i == 5) //{
				//System.out.println(i);
				//break;
				//System.out.println(i);
				labelForJ: 
					for(int j = 0; j < 10; j++) {
					System.out.println("O valor de i é: " + i + " e o valor de J e: " + j);
					if(j == 6 && i == 2)
						break labelForI;
				}
			//}
	
			int a = 0;
			labelForWhile:
			while(a < 10) {
				a++;
				if(a==5)
					break labelForI;
			}
		}
		
	}

}
