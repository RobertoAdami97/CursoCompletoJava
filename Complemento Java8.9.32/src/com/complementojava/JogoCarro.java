package com.complementojava;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JogoCarro extends JFrame{
	
	JLabel lCarro1 = new JLabel(new ImageIcon(getClass().getResource("carro1.png")));
	JLabel lCarro2 = new JLabel(new ImageIcon(getClass().getResource("carro2.png")));
	JLabel lCarro3 = new JLabel(new ImageIcon(getClass().getResource("carro3.png")));
	
	public JogoCarro() {
		editarJanela();
		new Movimento().start();
	}
	
	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1400,350);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		lCarro1.setBounds(0, 0, 200, 100);
		lCarro2.setBounds(0, 100, 200, 100);
		lCarro3.setBounds(0, 200, 200, 100);
		
		add(lCarro1);
		add(lCarro2);
		add(lCarro3);
		
	}
	
	public class Movimento extends Thread{
		public void run() {
			while(true) {
				try {
					sleep(20);
					if(lCarro1.getX() < 1200) {
						lCarro1.setBounds(lCarro1.getX()+1, 0, 200, 100);
					}
					if(lCarro2.getX() < 1200) {
						lCarro2.setBounds(lCarro2.getX()+2, 100, 200, 100);
					}
					if(lCarro3.getX() < 1200) {
						lCarro3.setBounds(lCarro3.getX()+5, 200, 200, 100);
					}
					
					
				}catch(Exception e) {
					e.getStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		
		new JogoCarro();
		
	}

}
