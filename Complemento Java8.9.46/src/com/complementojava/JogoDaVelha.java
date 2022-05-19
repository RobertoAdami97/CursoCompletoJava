package com.complementojava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JogoDaVelha extends JFrame{
	
	
	ImageIcon iconCirculo = new ImageIcon(getClass().getResource("circulo.png"));
	ImageIcon iconX = new ImageIcon(getClass().getResource("xis.png"));
	
	
	final int JOGADOR_1 = 1;
	final int JOGADOR_2 = 2;
	
	
	int jogadorVez = JOGADOR_1;
	
	
	JPanel pTela = new JPanel(new GridLayout(3, 3, 10, 10));
	JLabel lInformacao = new JLabel("Jogador " + JOGADOR_1);
	
	Bloco[] blocos = new Bloco[9];
	
	int rodadas = 0;
	
	public JogoDaVelha() {
		configurarJanela();
		configurarTela();
	
	}
	
	public void configurarJanela() {
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void mudarVez() {
		if(jogadorVez==1) {
			jogadorVez = JOGADOR_2;
			lInformacao.setText("Jogador 2");
			lInformacao.setForeground(Color.RED);
		}else {
			jogadorVez = JOGADOR_1;
			lInformacao.setText("Jogador 1");
			lInformacao.setForeground(new Color(50,200,50));
		}
	}
	
	public boolean testarVitoria(int jogador) {
		if(blocos[0].proximoJogador == jogador && blocos[1].proximoJogador == jogador && blocos[2].proximoJogador == jogador) {
			return true;
		}
		if(blocos[3].proximoJogador == jogador && blocos[4].proximoJogador == jogador && blocos[5].proximoJogador == jogador) {
			return true;
		}
		if(blocos[6].proximoJogador == jogador && blocos[7].proximoJogador == jogador && blocos[8].proximoJogador == jogador) {
			return true;
		}
		if(blocos[0].proximoJogador == jogador && blocos[3].proximoJogador == jogador && blocos[6].proximoJogador == jogador) {
			return true;
		}
		if(blocos[1].proximoJogador == jogador && blocos[4].proximoJogador == jogador && blocos[7].proximoJogador == jogador) {
			return true;
		}
		if(blocos[2].proximoJogador == jogador && blocos[5].proximoJogador == jogador && blocos[8].proximoJogador == jogador) {
			return true;
		}
		if(blocos[0].proximoJogador == jogador && blocos[4].proximoJogador == jogador && blocos[8].proximoJogador == jogador) {
			return true;
		}
		if(blocos[6].proximoJogador == jogador && blocos[4].proximoJogador == jogador && blocos[2].proximoJogador == jogador) {
			return true;
		}
		return false;
	}
	
	
	public void configurarTela() {
		add(BorderLayout.CENTER,pTela);
		add(BorderLayout.NORTH,lInformacao);
		pTela.setBackground(Color.BLACK);
		lInformacao.setFont(new Font("Arial",Font.BOLD,30));
		lInformacao.setForeground(new Color(50,200,50));
		lInformacao.setHorizontalAlignment(SwingConstants.CENTER);
		
		for(int i = 0; i < 9; i++) {
			Bloco bloco = new Bloco();
			blocos[i] = bloco;
			pTela.add(bloco);
		}
			
	}
	
	
	
	
	public static void main(String[] args) {
		
		new JogoDaVelha();
		
	}
	
	public class Bloco extends JButton {
		int proximoJogador = 0;
		public Bloco() {
			setBackground(Color.WHITE);
			addActionListener(e -> {
				if(proximoJogador == 0) {
					if(jogadorVez == JOGADOR_1) {
						setIcon(iconCirculo);
						proximoJogador = JOGADOR_1;
					}else {
						setIcon(iconX);
						proximoJogador = JOGADOR_2;
					}
					if(testarVitoria(proximoJogador)) {
						JOptionPane.showMessageDialog(null, "Jogador " + proximoJogador + " venceu!");
						System.exit(0);
					}
					rodadas++;
					if(rodadas == 9) {
						JOptionPane.showMessageDialog(null, "Deu velha!");
						System.exit(0);
					}
					mudarVez();
				}
			});
		}
	}

}
