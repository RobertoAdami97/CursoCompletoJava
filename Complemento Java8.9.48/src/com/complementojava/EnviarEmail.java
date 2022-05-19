package com.complementojava;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class EnviarEmail {

	public static void main(String[] args) {
		
		String meuEmail = "robertoadamiadami5@gmail.com";
		// para funcionar eu tenho que ir na minha conta do google e liberar apps menos seguros
		// gerenciar conta > segurança > Acesso a app menos seguro
		String minhaSenha = "CartCoubek[1997]";
		
//		o SimpleEmail é para enviar email sem anexo
		
//		SimpleEmail email = new SimpleEmail();
		
//		O MultiPartEmail é para enviar email com anexo
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
		email.setSSLOnConnect(true);
		
		try {
			
			email.setFrom(meuEmail);
			email.setSubject("Video Aula Java");
			email.setMsg("Enviando email com anexo, segue os anexos abaixo...");
			email.addTo(meuEmail);
			
//			EmailAttachment anexo = new EmailAttachment();
//			anexo.setPath("C:/Users/CCE/Desktop/commons-email/texto.txt");
//			anexo.setName("arquivo_de_texto.txt");
//			email.attach(anexo);
			
			EmailAttachment[] anexos = new EmailAttachment[3];
			anexos[0] = new EmailAttachment();
			anexos[0].setPath("C:/Users/CCE/Desktop/commons-email/texto.txt");
			anexos[0].setName("arquivo_de_texto.txt");
			
			EmailAttachment[] anexos1 = new EmailAttachment[3];
			anexos1[1] = new EmailAttachment();
			anexos1[1].setPath("C:/Users/CCE/Desktop/commons-email/jar_files.zip");
			anexos1[1].setName("jar_files.zip");
			
			EmailAttachment[] anexos2 = new EmailAttachment[3];
			anexos2[2] = new EmailAttachment();
			anexos2[2].setPath("C:/Users/CCE/Desktop/commons-email/commons-email-1.5.jar");
			anexos2[2].setName("commons-email-1.5.jar");
			
			
			email.send();
			System.out.println("Email foi enviado com sucesso!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
