package com.complementojava;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Intervalo extends JFrame{
	
	Font fonte = new Font("Arial", Font.BOLD,150);
	JLabel numero = new JLabel("0");
	
	
	public Intervalo() {
		numero.setFont(fonte);
		numero.setHorizontalAlignment(SwingConstants.CENTER);
		add(numero);
		setLayout(new GridLayout(1,5));
		setTitle("Programa de Soma");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public void contagem() {
		int n = 0;
		while(true) {
			numero.setText(Integer.toString(n));
			n++;
			
			try {
				Thread.sleep(1);
			}catch(Exception erro) {
				
			}
			
		}
		
	}
	

	public static void main(String[] args) {
		
		Intervalo obj = new Intervalo();
		obj.contagem();
	}

}
