package com.complementojava;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame {
	
	JRadioButton rb = new JRadioButton("Masculino", true);
	JRadioButton rb2 = new JRadioButton("Feminino", false);
	
//	O ButtonGroup serve para que só um radio button possa ser selecionado
	ButtonGroup gp = new ButtonGroup();
	
	public RadioButton() {
		
		setLayout(new FlowLayout());
		
		setTitle("Título");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(rb);
		add(rb2);
		
		gp.add(rb);
		gp.add(rb2);

	}
	

	public static void main(String[] args) {

		new RadioButton();
		
	}

}
