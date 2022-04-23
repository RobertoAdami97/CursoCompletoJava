package com.complementojava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Botao extends JFrame {
	
	JButton jb = new JButton("Botao 1");
	JButton jb2 = new JButton("Botao 1");
	
	public Botao() {
		
		setLayout(null);
		
		
//		essa sintaxe de cima é igual a de baixo, porem a de baixo é bem reduzida
//		getContentPane().add(jb);
		jb.setBounds(300, 250, 100, 60);
		add(jb);
		
		jb2.setBounds(250, 150, 100, 60);
		add(jb2);
		
		setTitle("Titulo da Janela");
		setSize(700,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new Botao();
		
	}

}
