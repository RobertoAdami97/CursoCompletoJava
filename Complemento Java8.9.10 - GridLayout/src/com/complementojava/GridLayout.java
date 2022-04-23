package com.complementojava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout extends JFrame {
	
	
	JButton btn = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");

	public GridLayout() {
		
		setLayout(new java.awt.GridLayout(6,1));
		
		setTitle("Titulo da grid");
		setSize(700,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(btn);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
	}
	
	public static void main(String[] args) {
		
		new GridLayout();
		
	}

}
