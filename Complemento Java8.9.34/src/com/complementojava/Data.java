package com.complementojava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	public static void main(String[] args) {
		
		Date data = new Date();
		
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy HH:MM");
		
		String dataFormatada = formatar.format(data);
		
		System.out.println(dataFormatada);
		
		
		/*
		  y Year
		  M Month in year
		  D Day in year
		  d Day in month
		  H Hour in day
		  h hour in am/pm
		  m Minute in hour
		  s Second in minute
		  S Milisecond Number
		 */
		
		
	}

}
