package com.complementojava;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pintar extends JFrame {
	
	JLabel recado = new JLabel("Vídeo Aula Java Nº 80");
	ImageIcon fundo = new ImageIcon(getClass().getResource("fundo.png"));
	
	
	public Pintar() {
		setSize(915,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		recado.setFont(new Font("Arial", Font.BOLD, 86));
		
		
		Panel painel = new Panel();
		add(painel);
		painel.setLayout(new BorderLayout());
		painel.add(recado);
		
	}
	
	public class Panel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Image img = fundo.getImage();
			g.drawImage(img,0,0,this); //o parametro this indica a propria classe
		}
	}
	
	
	public static void main(String[] args) {
		
		new Pintar();
		
	}

}
