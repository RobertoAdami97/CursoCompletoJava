package com.complementojava;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class LerArquivo {

	public static void main(String[] args) {
		
		Path caminho = Paths.get("C:/Users/CCE/Desktop/TesteArquivo/arquivo.txt");
		
		try {
//			o retorno do metodo files � um array de bytes
			byte[] texto = Files.readAllBytes(caminho);
			String leitura = new String(texto);
			
			JOptionPane.showMessageDialog(null, leitura);
		}catch(Exception e) {
			e.getMessage();
		}
		
		
	}

}
