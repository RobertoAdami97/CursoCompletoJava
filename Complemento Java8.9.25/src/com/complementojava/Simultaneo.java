package com.complementojava;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


// todo esse codigo serve para mostrar como executar codigo simultaneamente
public class Simultaneo extends JFrame {
	
	JLabel tempo = new JLabel("0");
	JLabel idade = new JLabel();
	int segundos = 0;
	
	public Simultaneo() {
		editarLayout();
//		com o metodo thread ele executa simultaneamente o contarTempo e o java executa o mostrarMensgaem
		contarTempo obj = new contarTempo();
		obj.start();
		mostrarMensagem();
		obj.stop();
	}
	
	
	public void editarLayout() {
		Font fonte = new Font("Arial", Font.BOLD, 50);
		Font fonte2 = new Font("Arial", Font.BOLD, 30);
		
		add(BorderLayout.NORTH, tempo);
		add(BorderLayout.CENTER, idade);
		
		tempo.setHorizontalAlignment(SwingConstants.CENTER);
		idade.setHorizontalAlignment(SwingConstants.CENTER);
		tempo.setFont(fonte2);
		idade.setFont(fonte);
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
		
	
	public void mostrarMensagem() {
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?"));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Em que ano estamos?"));
		int resultado = anoAtual - anoNasc;
		
		idade.setText("Sua idade é: " + resultado);
		JOptionPane.showMessageDialog(null, "Você gastou "+segundos+" segundos para responder!");
	}
	

	public static void main(String[] args) {
		
		new Simultaneo();
		
	}
	
	public class contarTempo extends Thread {
		public void run() {
			while(true) {
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					
				}
				
				segundos++;
				tempo.setText(Integer.toString(segundos));

			}
		}
	}

}
