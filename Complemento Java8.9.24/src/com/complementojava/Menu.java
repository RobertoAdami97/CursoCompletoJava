package com.complementojava;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame{

	JMenuBar barra = new JMenuBar();
	
	JMenu menu1 = new JMenu("Opções");
	JMenu menu2 = new JMenu("Sair");
	
	JMenuItem item1 = new JMenuItem("Exit");
	
	public Menu() {
		
		setJMenuBar(barra);
		barra.add(menu1);
		barra.add(menu2);

		menu2.add(item1);
		
		setLayout(new FlowLayout());
		
		setTitle("Menu");
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		
		new Menu();
		
	}

}
