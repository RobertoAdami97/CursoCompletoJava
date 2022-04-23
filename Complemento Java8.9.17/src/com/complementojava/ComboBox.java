package com.complementojava;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame {
	
	JComboBox<String> combo = new JComboBox<String>();
	
	public ComboBox() {
		setLayout(new FlowLayout());
		
		setTitle("Título");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(combo);
		combo.addItem("Cavalo");
		combo.addItem("Égua");
		combo.addItem("Cachorro");
		
		combo.setSelectedIndex(-1);
		combo.setSelectedIndex(0);
		combo.setSelectedIndex(2);
		
		combo.setSelectedItem("Égua");
		
		System.out.println(combo.getSelectedIndex());
		System.out.println(combo.getSelectedItem());
		System.out.println(String.valueOf(combo.getSelectedItem()));
		
	}
	

	public static void main(String[] args) {

		
		new ComboBox();
		
		
	}

}
