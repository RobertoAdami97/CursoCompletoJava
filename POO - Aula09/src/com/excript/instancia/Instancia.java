package com.excript.instancia;

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

public class Instancia {

	public static void main(String[] args) {

		Retangulo r1 = null;
		if(r1 != null) {
			r1.isQuadrado();
		}
		
		//NullPointerException
		//Se o programa compilasse teria retornado um ponteiro nulo,
		//pois nos só declaramos a variavel r1 mas a classe Retangulo nao foi instanciada.
	}

}
