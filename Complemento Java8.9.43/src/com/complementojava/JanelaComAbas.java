package com.complementojava;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JanelaComAbas extends JFrame{
	
	JTabbedPane abas = new JTabbedPane();
	JPanel painelBlack = new JPanel();
	JPanel painelWhite = new JPanel();
	JPanel painelGray = new JPanel();
	
	public JanelaComAbas() {
		configurarJanela();
		add(BorderLayout.CENTER, abas);
		abas.addTab("Painel Black", painelBlack);
		abas.addTab("Painel White", painelWhite);
		abas.addTab("Painel Gray", painelGray);
		
		painelBlack.setBackground(Color.BLACK);
		painelWhite.setBackground(Color.WHITE);
		painelGray.setBackground(Color.GRAY);
		
		abas.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				int aba = abas.getSelectedIndex();
				String titulo = abas.getTitleAt(aba);
				System.out.println(titulo);
			}
		});
		
	}
	
	public void configurarJanela() {
		setTitle("Janela com Várias Abas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new JanelaComAbas();
		
	}

}
