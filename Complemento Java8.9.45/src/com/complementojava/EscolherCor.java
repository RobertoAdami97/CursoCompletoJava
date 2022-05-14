package com.complementojava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EscolherCor extends JFrame{
	
	JColorChooser caixaCores = new JColorChooser();
	JLabel titulo = new JLabel("Aula de Java 88 - JColorChooser");

	public EscolherCor() {
		configurarJanela();
		add(BorderLayout.CENTER,caixaCores);
		add(BorderLayout.NORTH,titulo);
		titulo.setFont(new Font("Arial",Font.BOLD,35));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		caixaCores.getSelectionModel().addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				Color corAtual = caixaCores.getColor();
				titulo.setForeground(corAtual);
			}
		});;
	}
	
	public void configurarJanela() {
		setTitle("Escolher Cor");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(650,650);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new EscolherCor();
		
	}

}
