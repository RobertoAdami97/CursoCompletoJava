package com.complementojava;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class MiniPaint extends JFrame {
	
	Boolean pressionado = false;
	
	public MiniPaint() {
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				pressionado = false;
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				pressionado = true;
				desenhos.clear();
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		new Time().start();
		
		setSize(1200,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	ArrayList<Desenho> desenhos = new ArrayList<>();
	
	public class Desenho {
		int x, y;
		
		public Desenho(int x, int y) {
			this.y = y;
			this.x = x;
		}
		
	}
	
	public void paint(Graphics g) {
		for(int i = 1; i < desenhos.size();i++) {
			int x = desenhos.get(i).x;
			int y = desenhos.get(i).y;
			int x2 = desenhos.get(i-1).x; 
			int y2 = desenhos.get(i-1).y;
			g.drawLine(x2, y2, x, y);
		}

	}
	
	public class Time extends Thread {
		public void run() {
			while(true) {
				if(pressionado) {
					try {
						Point ponto = getMousePosition();
						desenhos.add(new Desenho(ponto.x, ponto.y));
					}catch(Exception e) {
						repaint();
					}
				}
			}
		}
	}
	

	public static void main(String[] args) {
		
		new MiniPaint();
		
	}

}
