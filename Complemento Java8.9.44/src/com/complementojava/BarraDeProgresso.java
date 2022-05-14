package com.complementojava;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class BarraDeProgresso extends JFrame {
	
	JProgressBar barra = new JProgressBar();

	public BarraDeProgresso() {
		configurarJanela();
		barra.setBounds(40,40,500,50);
		barra.setStringPainted(true);
		barra.setValue(50);
		barra.setMaximum(1000);
		barra.setForeground(new Color(50,200,50));
		add(barra);
		
		new Temporizador().start();
	}
	
	public void configurarJanela() {
		setTitle("Barra de Progresso");
		setLayout(null);
		setSize(600,170);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public class Temporizador extends Thread {
		public void run() {
			try {
				while(barra.getValue() < 1000) {
					sleep(10);
					barra.setValue(barra.getValue() + 10);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			JOptionPane.showMessageDialog(null, "Carregado!");
		}
	}
	
	public static void main(String[] args) {
		
		new BarraDeProgresso();
		
	}

}
