package com.complementojava;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProgramaSoma extends JFrame {
	
	
	JTextField numero1 = new JTextField();
	JTextField numero2 = new JTextField();
	
	JLabel sinalMais = new JLabel("+");
	JLabel resultado = new JLabel();
	
	
	JButton btn = new JButton("=");
	
	Font fonte = new Font("Arial",Font.BOLD,50);
	
	public ProgramaSoma() {
		
		setLayout(new GridLayout(1,5));
		
		setTitle("Programa de Soma");
		setSize(600,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		add(numero1);
		add(sinalMais);
		add(numero2);
		add(btn);
		add(resultado);
		
		numero1.setFont(fonte);
		numero2.setFont(fonte);
		sinalMais.setFont(fonte);
		btn.setFont(fonte);
		resultado.setFont(fonte);
		
		
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(numero1.getText());
				int n2 = Integer.parseInt(numero2.getText());
				
				int soma = n1 + n2;
				resultado.setText(Integer.toString(soma));
			}
			
		});
		
		
	}
	

	public static void main(String[] args) {
		
		new ProgramaSoma();
		
	}

}
