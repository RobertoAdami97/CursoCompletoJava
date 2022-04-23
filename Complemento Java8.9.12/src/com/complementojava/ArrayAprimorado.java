package com.complementojava;

import java.util.ArrayList;

public class ArrayAprimorado {

	public static void main(String[] args) {
		
		ArrayList<String> nome = new ArrayList<String>();
		
		nome.add("Carlos");
		nome.add("Beto");
		
//		nome.remove(1);
//		nome.remove("Carlos");
//		nome.clear();
		System.out.println(nome.toString());
		System.out.println(nome.get(0));
		System.out.println(nome.isEmpty());
		System.out.println(nome.contains("Beto"));
		System.out.println(nome.size());
		System.out.println(nome.indexOf("Carlos"));
//		retorna -1 quando nao encontra o objeto
		System.out.println(nome.indexOf("Car"));
		
	}

}
