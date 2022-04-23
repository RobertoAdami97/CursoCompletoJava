package com.excript.recursividade;

import javax.swing.JOptionPane;

class Fatorial{
	
	int fat(int n) {
		if(n <= 1) {//a nossa condição basica
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
		//Recursividade é uma situação onde uma rotina invoca a si mesma
//		A recursividade trabalha de forma similar a um laço de repetição, na verdade tudo que 
//		fazemos em laço, pode ser feito em recursividade. A recursividade é nada mais nada 
//		menos do que uma função dentro da outra e ela deve ser pensada como uma 
//		pilha (estrutura de dados onde o ultimo a entrar, deve ser o primeiro a sair). 
//		A estrutura dela consiste em descer até a base fazendo os cálculos ou rotinas de cada 
//		instrução, e então da base até o topo da pilha são empilhados os resultados de cada 
//		instrução e no final o topo contém o resultado que é retornado. Na figura a seguir, 
//		temos um exemplo que é frequentemente usado para explicar a recursividade, podemos 
//		encontrar em diversos livros didáticos, porque é um dos mais fáceis para se entender, 
//		estou falando do fatorial.
//		http://www.linhadecodigo.com.br/artigo/3316/recursividade-em-java.aspx#:~:text=A%20recursividade%20trabalha%20de%20forma,ser%20o%20primeiro%20a%20sair).
		
//		System.out.println(new Fatorial().fat(4));
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		
		Fatorial f = new Fatorial();
		n = f.fat(n);
		
		JOptionPane.showMessageDialog(null, "O fatorial é: " + n);
		
	}

}
