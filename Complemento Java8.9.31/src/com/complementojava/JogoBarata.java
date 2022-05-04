package com.complementojava;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JogoBarata extends JFrame{
	
	Boolean mousePressionado = false;
	
	ImageIcon barataMorta = new ImageIcon(getClass().getResource("barataMorta.png"));
	ImageIcon barataViva = new ImageIcon(getClass().getResource("barataViva.gif"));
	
	JLabel l = new JLabel(barataViva);
	
	public JogoBarata() {
		editarJanela();
		int x = (int)(Math.random() * 550);
		int y = (int)(Math.random() * 450);
		l.setBounds(x, y, 254, 142);
		new Mover().start();
		l.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				mousePressionado = false;
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				mousePressionado = true;
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				l.setIcon(barataMorta);
			}
		});
	}
	
	public class Mover extends Thread{
		public void run() {
			while(true) {
				try {
					sleep(10);
					if(mousePressionado) {
						Point ponto = getMousePosition();
//						-127 e -71 subtrai as posições de largura e altura pela metade da
//						largura e altura da imagem. isso foi feito por que a imagem da barata
//						ficou um pouco mais pra baixo do cursor do mouse e pra direita tambem
						l.setBounds(ponto.x -127, ponto.y -71, 254, 142);
					}
				}catch(Exception erro) {
					erro.getMessage();
				}
			}
		}
	}
	
	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		add(l);
	}

	public static void main(String[] args) {
		
		new JogoBarata();
		
	}

}
