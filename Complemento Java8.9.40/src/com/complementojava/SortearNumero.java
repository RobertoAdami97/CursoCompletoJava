package com.complementojava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SortearNumero extends JFrame {
	
	
	JButton bSortear = new JButton("Sortear");
	
	JLabel lDado = new JLabel();
	
	
	public SortearNumero() {
		editarJanela();
		acaoBotao();
	}
	
	public void acaoBotao() {
		bSortear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Sortear().start();
			}
		});
	}
	
	public void mudarImagem(String nome) {
		lDado.setIcon(new ImageIcon(getClass().getResource(nome)));
	}
	
	public class Sortear extends Thread {
		public void run() {
			try {
				mudarImagem("dadoGirando.gif");
				sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			int x = (int)(Math.random() * 6)+1;
			mudarImagem(x+".png");
		}
	}
	
	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(BorderLayout.CENTER,lDado);
		add(BorderLayout.SOUTH,bSortear);
		lDado.setHorizontalAlignment(SwingConstants.CENTER);
	}

	public static void main(String[] args) {
		
		new SortearNumero();
		
	}

}
