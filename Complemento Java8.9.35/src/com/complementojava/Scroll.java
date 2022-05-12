package com.complementojava;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Scroll extends JFrame{
	
//	JTextArea caixaDeTexto = new JTextArea();
	JLabel imagem = new JLabel(new ImageIcon(getClass().getResource("teste.jpg")));
	JScrollPane scroll = new JScrollPane(imagem);

	public Scroll() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(scroll);
	}
	
	public static void main(String[] args) {
		
		new Scroll();
		
	}

}
