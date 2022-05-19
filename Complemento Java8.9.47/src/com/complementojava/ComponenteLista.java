package com.complementojava;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ComponenteLista extends JFrame{

	String[] paises = {"brasil","holanda","inglaterra","coreiaDoSul"};
	JList lista = new JList(paises);
	
	JLabel bandeira = new JLabel();
	
	public ComponenteLista() {
		configurarJanela();
		add(BorderLayout.WEST,lista);
		add(BorderLayout.CENTER,bandeira);
		
		lista.addListSelectionListener(e ->{
			int index = lista.getSelectedIndex();
			String pais = paises[index];
			bandeira.setIcon(new ImageIcon(getClass().getResource(pais+".png")));
		});
	}	
	
	public void configurarJanela() {
		setTitle("Lista");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(335,210);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new ComponenteLista();
		
	}

}
