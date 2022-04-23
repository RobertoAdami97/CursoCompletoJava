package com.complementojava;

import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		
		setTitle("Titulo da Janela");
		setSize(500,400);
		//O comando abaixo faz com que quando clique no X, feche a janela do JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Janela();
		
	}

}
