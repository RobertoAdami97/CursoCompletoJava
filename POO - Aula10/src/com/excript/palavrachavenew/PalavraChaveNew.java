package com.excript.palavrachavenew;

class Retangulo{
	public int width;
	public int height;
	
	public int areaTotal() {
		return width * height;
	}
	
	public boolean isQuadrado() {
		if(width == height) {
			return true;
		}else {
			return false;
		}
	}
	
}

public class PalavraChaveNew {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		Retangulo r2;
		
		r2 = r1;
		
		r1.width = 1000;
		
//		System.out.println(r1.width);
//		System.out.println(r2.width);
		
		int i1 = 10;
		int i2 = i1;
		i1 = 20;
		System.out.println(i1);
		System.out.println(i2);
		
//		uma variavel se comporta diferentemente de um objeto de uma classe
//		enquanto na classe o objeto aponta para um objeto na memoria(independente do valor),
//		na variavel o apontamento é no valor.
//		então, quando um objeto recebe o outro objeto ele não altera o seu valor, ja quando
//		uma variavel recebe outra variavel, o valor da segunda variavel pode ser diferente da 
//		primeira variavel
		

		
	}

}
