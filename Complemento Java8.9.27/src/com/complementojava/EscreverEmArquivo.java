package com.complementojava;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class EscreverEmArquivo {

	public static void main(String[] args) {
//		caso o arquivo.txt não existe, o java irá cria-lo no diretorio passado abaixo
		Path caminho = Paths.get("C:/Users/CCE/Desktop/TesteArquivo/arquivo.txt");
		
		String texto = JOptionPane.showInputDialog("O que quer escrever no bloco de notas?");
		byte[] textoEmByte = texto.getBytes();
		
		try {
			Files.write(caminho, textoEmByte);
			String textoFormatado = new String(textoEmByte);
			JOptionPane.showMessageDialog(null, textoFormatado);
		}catch(Exception e) {
			e.getStackTrace();
		}
		
	}

}
