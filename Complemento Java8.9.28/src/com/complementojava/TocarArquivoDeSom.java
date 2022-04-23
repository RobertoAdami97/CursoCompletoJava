package com.complementojava;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TocarArquivoDeSom extends JFrame{

	JButton tocar = new JButton("Voz do silvio");
	
	public TocarArquivoDeSom() {
		
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		add(tocar);
		
		tocar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				play("silvio-santos-certa-resposta");
			}
		});
	}
	
	public void play(String nomeAudio) {
		URL url = getClass().getResource(nomeAudio + ".wav");
		AudioClip audio = Applet.newAudioClip(url);
		audio.play();
	}
	
	
	public static void main(String[] args) {
		
		new TocarArquivoDeSom();
		
	}

}
