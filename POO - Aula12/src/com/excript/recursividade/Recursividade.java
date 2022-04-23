package com.excript.recursividade;

import javax.swing.JOptionPane;

class Fatorial{
	
	int fat(int n) {
		if(n <= 1) {//a nossa condi��o basica
			return 1;
		}
//		
//		int r = fat(n-1)*n;
//		return r;
		
		return n * fat(n-1);
	}
	
}

public class Recursividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Recursividade � uma situa��o onde uma rotina invoca a si mesma
//		A recursividade trabalha de forma similar a um la�o de repeti��o, na verdade tudo que 
//		fazemos em la�o, pode ser feito em recursividade. A recursividade � nada mais nada 
//		menos do que uma fun��o dentro da outra e ela deve ser pensada como uma 
//		pilha (estrutura de dados onde o ultimo a entrar, deve ser o primeiro a sair). 
//		A estrutura dela consiste em descer at� a base fazendo os c�lculos ou rotinas de cada 
//		instru��o, e ent�o da base at� o topo da pilha s�o empilhados os resultados de cada 
//		instru��o e no final o topo cont�m o resultado que � retornado. Na figura a seguir, 
//		temos um exemplo que � frequentemente usado para explicar a recursividade, podemos 
//		encontrar em diversos livros did�ticos, porque � um dos mais f�ceis para se entender, 
//		estou falando do fatorial.
//		http://www.linhadecodigo.com.br/artigo/3316/recursividade-em-java.aspx#:~:text=A%20recursividade%20trabalha%20de%20forma,ser%20o%20primeiro%20a%20sair).
		
//		System.out.println(new Fatorial().fat(4));
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		Fatorial f = new Fatorial();
		n = f.fat(n);
		
		JOptionPane.showMessageDialog(null, "O fatorial �: " + n);
		
	}

}
