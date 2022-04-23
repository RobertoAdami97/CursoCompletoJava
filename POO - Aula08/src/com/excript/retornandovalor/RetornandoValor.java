package com.excript.retornandovalor;

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

public class RetornandoValor {
	
	public static void main(String[] args) {
		
		Retangulo quadrado = new Retangulo();
		
		quadrado.width = 100;
		quadrado.height = 120;
		
		System.out.println(quadrado.areaTotal());
		System.out.println(quadrado.isQuadrado());
		
		
		Retangulo quadrado2 = new Retangulo();
		
		quadrado2.width = 100;
		quadrado2.height = 100;
		
		System.out.println(quadrado2.areaTotal());
		System.out.println(quadrado2.isQuadrado());
	}
	
}
