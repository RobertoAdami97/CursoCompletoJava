package com.complementojava;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class CapturarTeclado extends JFrame {
	
	

	public CapturarTeclado() {
		
//		setLayout(new FlowLayout());
		
		setTitle("Título");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		
		addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				
				char letra = e.getKeyChar();
				
				System.out.println(letra);
			}
			
		});
				
		
		
		
	}
	
	public static void main(String[] args) {
		
		new CapturarTeclado();
		
	}

}
