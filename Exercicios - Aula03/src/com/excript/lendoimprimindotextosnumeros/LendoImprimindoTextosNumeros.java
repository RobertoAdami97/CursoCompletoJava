package com.excript.lendoimprimindotextosnumeros;

import javax.swing.JOptionPane;

public class LendoImprimindoTextosNumeros {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		String cidade = JOptionPane.showInputDialog("Digite o nome da sua cidade de nascimento");
		
		JOptionPane.showMessageDialog(null, 
				"Ol�. Meu nome � " + nome + ", sou natural de " + cidade +
				", tenho " + idade + " anos e estou aprendendo a programar.");
	}

}
