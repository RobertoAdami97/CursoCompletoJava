package com.complementojava;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Desenhar extends JFrame {
	
	
	public Desenhar() {
		setSize(1200,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		
		g.drawLine(100,100,500,500);
		g.drawRect(400,100,300,300);
		g.drawOval(420,120,260,260);
		g.setColor(Color.BLUE);
		g.fillRect(700,450,400,400);
		g.setColor(Color.RED);
		g.fillOval(720, 470, 360, 360);
		g.clearRect(200,200,600,6);
	}
	

	public static void main(String[] args) {
		
		new Desenhar();
		
	}

}
