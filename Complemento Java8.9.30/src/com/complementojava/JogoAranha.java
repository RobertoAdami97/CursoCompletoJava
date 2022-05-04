package com.complementojava;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JogoAranha extends JFrame{
	
	ImageIcon iconParede = new ImageIcon(getClass().getResource("muro.png"));
	ImageIcon aranhaMexendo = new ImageIcon(getClass().getResource("aranhaMexendo.gif"));
	ImageIcon aranhaParado = new ImageIcon(getClass().getResource("aranha.png"));
	
	
	JLabel lParede = new JLabel(iconParede);
	JLabel lAranhaParado = new JLabel(aranhaParado);
	
	int posAranhaParadoX = 300;
	int posAranhaParadoY = 200;
	
	public JogoAranha() {
		editarJanela();
		editarComponentes();
		adicionarMovimento();
	}
	
	public void editarComponentes() {
		lParede.setBounds(0, 0, 700, 441);
		lAranhaParado.setBounds(posAranhaParadoX, posAranhaParadoY, 103, 201);
	}
	
	public void adicionarMovimento() {
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {

				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				lAranhaParado.setIcon(aranhaParado);
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				lAranhaParado.setIcon(aranhaMexendo);
				
//				38 é o codigo da seta para cima 
				if(e.getKeyCode() == 38) {
					posAranhaParadoY -= 10;
				}
				
//				40 é o codigo da seta para baixo
				if(e.getKeyCode() == 40) {
					posAranhaParadoY += 10;
				}
				
//				37 é o codigo da seta para a esquerda
				if(e.getKeyCode() == 37) {
					posAranhaParadoX -= 10;
				}
				
//				39 é o codigo da seta para a direita
				if(e.getKeyCode() == 39) {
					posAranhaParadoX += 10;
				}
				
				lAranhaParado.setBounds(posAranhaParadoX, posAranhaParadoY, 103, 201);
				
			}
		});
	}
	
	
	public void editarJanela() {
		
		add(lAranhaParado);
		add(lParede);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(680,480);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
	}
	

	public static void main(String[] args) {
		
		new JogoAranha();
		
	}

}
