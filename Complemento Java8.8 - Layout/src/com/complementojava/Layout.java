package com.complementojava;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame {

	JButton btn = new JButton("Cima");
	JButton btn2 = new JButton("Baixo");
	JButton btn3 = new JButton("Esquerda");
	JButton btn4 = new JButton("Direita");
	JButton btn5 = new JButton("Centro");
	
	
	public Layout() {
		
//		Por padrão o codigo abaixo não seria necessário, pois toda JFrame vem com border layout
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH, btn);
		add(BorderLayout.SOUTH, btn2);
		add(BorderLayout.EAST, btn3);
		add(BorderLayout.WEST, btn4);
		add(BorderLayout.CENTER, btn5);
		
		
		setTitle("Titulo da Janela");
		setSize(700,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		new Layout();
		
	}

}
