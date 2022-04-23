package com.excript.aula039;

public class Aula039 {

	public static void main(String[] args) {
		
		label1: {
			labelIf: if(true) {
				System.out.println("Instrução if");
			}
			System.out.println("Label 1 ini");
		
			label2: {
				System.out.println("Label 2 ini");
		
				label3: {
					System.out.println("Label 3 ini");
					
					if(true)
						break label2;
		   
				}
				System.out.println("Label2 fim");
		    }
			System.out.println("Label1 fim");
		}
	}
}


