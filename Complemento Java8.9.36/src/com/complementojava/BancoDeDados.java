package com.complementojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class BancoDeDados {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "vertrigo"; 
		
		try {
			
//			CONEXÃO
			Connection con = DriverManager.getConnection(url,user,password);
			
//			CONSULTA NA TABELA
//			PreparedStatement pesquisa = con.prepareStatement("SELECT * FROM pessoas");
//			ResultSet resultadoConsulta = pesquisa.executeQuery();
//			while(resultadoConsulta.next()) {
//			String nome = resultadoConsulta.getString("nome");
//			String idade = resultadoConsulta.getString("idade");
//			
//			System.out.println("Nome: "+nome+", Idade: "+idade);
//			
//			}
			
//			ATUALIZAÇÃO NA TABELA
//			String update = "UPDATE pessoas set idade = 3 where idade = 48";
//			PreparedStatement atualizar = con.prepareStatement(update);
//			atualizar.executeUpdate();
//			System.out.println("Atualizou!");
			
			
//			INSERIR NA TABELA
//			String nome = "Cart";
//			int idade = 24;
//			String insert = "INSERT INTO PESSOAS(nome,idade) VALUES ('Ignacio da silveria', 34)";
//			String insert = "INSERT INTO PESSOAS(nome,idade) VALUES ('"+nome+"', "+idade+")";
//			PreparedStatement inserir = con.prepareStatement(insert);
//			inserir.execute();
//			JOptionPane.showMessageDialog(null, "Comando executado com sucesso!");
			
//			DELETAR UM REGISTRO
			String delete = "DELETE FROM pessoas where nome = 'Ignacio da silveria'";
			PreparedStatement deletar = con.prepareStatement(delete);
			deletar.executeUpdate();
			JOptionPane.showMessageDialog(null, "Comando delete executado com sucesso!");
			
			
		}catch(Exception erro) {
			erro.getStackTrace();
			System.out.println("nao deu");
		}
		
	}

}
