package com.complementojava;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CaixaDeTexto extends JFrame {
	
	
	JTextField text = new JTextField(30);
	

	public CaixaDeTexto() {
		setLayout(new FlowLayout());
		
		setTitle("T�tulo");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(text);
		text.setText("Ol� mundo!");
		System.out.println(text.getText());
	}
	
	public static void main(String[] args) {

		new CaixaDeTexto();
		
	}

}
