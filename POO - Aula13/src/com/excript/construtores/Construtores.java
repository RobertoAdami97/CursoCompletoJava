package com.excript.construtores;

class Janela{
	
	int largura, altura;
	
	//o nome do construtor deve ser sempre o mesmo nome da classe
	public Janela(int l, int a){
		largura = l;
		altura = a;
	}
	
	void imprimir() {
		System.out.println("Altura = " + altura + ", Largura = " + largura);
	}
	
}

public class Construtores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Janela j = new Janela(250, 300);
		
		j.imprimir();
		
	}

}
