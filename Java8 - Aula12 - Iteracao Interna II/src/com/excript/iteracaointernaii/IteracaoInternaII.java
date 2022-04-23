package com.excript.iteracaointernaii;

import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;


public class IteracaoInternaII {
	
public static void filtro(List<String> lista, Predicate<String> condicao) {
		
//		for(String s : lista) {
//			if(condicao.test(s)) {
//				System.out.println(s);
//			}
//		}
	
//	lista.stream().filter((str) -> condicao.test(str)).forEach((str) -> System.out.println(str));
		
	lista.stream().filter(condicao :: test).forEach(System.out :: println);
	
	}

	public static void main(String[] args) {
		
		
		List<String> lista1 = Arrays.asList(
				"Santa Catarina","Parana","São Paulo","Rio de Janeiro",
				"Brasilia","Ceara");
		
		System.out.println("Estados que iniciam com a letra S");
		filtro(lista1, (s) -> s.startsWith("S"));
		
		System.out.println("Estados que finalizam com a letra a");
		filtro(lista1, (s) -> s.endsWith("a"));
		
		System.out.println("Imprime toda a lista");
		filtro(lista1, (s) -> true);
		
		System.out.println("Não imprime a lista");
		filtro(lista1, (s) -> false);
		
		System.out.println("Imprime os nomes com mais de dez caracteres");
		filtro(lista1, (s) -> s.length() > 10);
		
		filtro(lista1, (s) -> s.equals("Snata Catarina"));
		
	}

}
