package com.complementojava;

import java.awt.Desktop;
import java.net.URI;

public class AbrirLink {
	
	

	public static void main(String[] args) {
		
		try {
			
			URI link = new URI("www.youtube.com");
			Desktop.getDesktop().browse(link);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
