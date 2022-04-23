package com.complementojava;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Jlabel extends JFrame {
	
	Font grande = new Font("Serif",Font.BOLD,50);
	
	JLabel legenda = new JLabel("Texto");
	
	public Jlabel() {
		setTitle("Título");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		legenda.setFont(grande);
		add(legenda);
		legenda.setText("Outro Texto");
		legenda.setHorizontalAlignment(SwingConstants.CENTER);
		
	}
	
	public static void main(String[] args) {
		
		new Jlabel();
		
	}

}
