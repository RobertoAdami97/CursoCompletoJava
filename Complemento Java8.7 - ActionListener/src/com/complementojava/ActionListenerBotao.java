package com.complementojava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionListenerBotao implements ActionListener  {
	
	
	JFrame jf = new JFrame();
	JButton btn = new JButton("Validar");
	JButton btn2 = new JButton("Sair");
	
	public ActionListenerBotao() {
		
		
		jf.setLayout(null);
		jf.setTitle("Nova Tela");
		jf.setSize(500,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		
		
		
		jf.add(btn);
		btn.setBounds(250, 150, 80, 40);
		
		
		jf.add(btn2);
		btn2.setBounds(300, 200, 80, 40);
		
//		O comando this referencia a propria classe de nome ActionListenerBotao
		btn.addActionListener(this);
		btn2.addActionListener(this);
	
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn) {
			JOptionPane.showMessageDialog(null, "Olá, mundo!");
		}else if(e.getSource()==btn2) {
			
//			O comando abaixo (System.exit(0)) fecha o programa
			System.exit(0);
//			jf.setVisible(false);
//			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	}
	
	public static void main(String[] args) {
		
		new ActionListenerBotao();
		
	}


}
