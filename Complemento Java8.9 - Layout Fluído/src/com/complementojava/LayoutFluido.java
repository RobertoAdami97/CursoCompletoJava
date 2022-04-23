package com.complementojava;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutFluido extends JFrame {
	
	JButton btn = new JButton();
	JButton btn2 = new JButton();
	
	public LayoutFluido() {
		
		
		
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		setTitle("Titulo do Layout");
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(btn);
		add(btn2);
		btn.setText("Validar");
		btn2.setText("Cancelar");
	}
	
	public static void main(String[] args) {

		new LayoutFluido();
		
	}

}
