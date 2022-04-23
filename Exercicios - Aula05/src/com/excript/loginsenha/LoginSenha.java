package com.excript.loginsenha;

import javax.swing.JOptionPane;

public class LoginSenha {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("login");
		String senha = JOptionPane.showInputDialog("Senha");
		
		String loginCompare = "Roberto";
		String senhaCompare = "11220138924";
		
		if(login.equals(loginCompare) && senha.equals(senhaCompare)) {
			JOptionPane.showMessageDialog(null, "Usuário realizou o login com sucesso!");
		}else {
			JOptionPane.showMessageDialog(null, "Login ou senha incorreta!");
		}
		
	}

}
