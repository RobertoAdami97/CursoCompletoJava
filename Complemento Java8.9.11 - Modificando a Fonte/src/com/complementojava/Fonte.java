package com.complementojava;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fonte extends JFrame {
	
	JButton btn = new JButton();
	Font fonte = new Font("Courier New", Font.ITALIC | Font.BOLD, 100);

	public Fonte() {
	
		setLayout(new java.awt.GridLayout(6,1));
		
		setTitle("Titulo da grid");
		setSize(700,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		btn.setText("Salvar");
		btn.setFont(fonte);
		add(btn);
	
	}
	
	
	public static void main(String[] args) {
		
		new Fonte();
		
	}

}
