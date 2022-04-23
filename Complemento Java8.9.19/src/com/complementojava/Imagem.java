package com.complementojava;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Imagem extends JFrame {
	
	ImageIcon img = new ImageIcon(getClass().getResource("ImagemTeste.png"));
	JLabel jb = new JLabel(img);

	public Imagem() {
		setLayout(new FlowLayout());
		
		setTitle("Título");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(jb);
	
	}
	
	public static void main(String[] args) {
		
		new Imagem();
		
	}

}
