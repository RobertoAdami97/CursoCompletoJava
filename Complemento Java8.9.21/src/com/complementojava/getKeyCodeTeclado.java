package com.complementojava;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class getKeyCodeTeclado extends JFrame{
	
	
	public getKeyCodeTeclado() {
		
		setLayout(new FlowLayout());
		
		setTitle("Título");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent e) {
				int codigo = e.getKeyCode();
				int tecla = KeyEvent.VK_ENTER;
				
				if(codigo == tecla) {
					System.out.println("Tecla enter pressionada");
				}
			}
			
		});
		
	}
	

	public static void main(String[] args) {
			
		new getKeyCodeTeclado();
		
	}

}
