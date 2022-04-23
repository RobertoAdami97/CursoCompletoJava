package com.excript.stremapratica;

import java.util.List;
import java.util.Arrays;

public class StreamPratica {

	public static void main(String[] args) {

		
		// antes do java 8
		
		List<String> lista1 = Arrays.asList(
				"Santa Catarina",
				"Parana",
				"São Paulo",
				"Rio de Janeiro",
				"Brasilia",
				"Ceara");
		
//		for(String s : lista1) {
//			System.out.println(s);
//		}
		
//		lista1.forEach(x -> System.out.println(x));
		lista1.forEach(System.out :: println);
		
	}

}
