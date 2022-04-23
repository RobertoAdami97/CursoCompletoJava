package com.complementojava;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox extends JFrame {
	
	
	JCheckBox checkBox = new JCheckBox("Validar", true);
	
	public CheckBox() {
		
		setLayout(new FlowLayout());
		
		setTitle("Título");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(checkBox);
		System.out.println(checkBox.isSelected());
		
		
		
	}

	public static void main(String[] args) {

		new CheckBox();
		
	}

}
